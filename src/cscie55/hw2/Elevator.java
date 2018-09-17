package cscie55.hw2;

/*******************************************************************************************************
 *
 * name: Brendan Murphy
 * CSCIE-55 HW 2
 * date: 09/25/2018
 *
 * Defines an elevator class that traverses a building and drops off passengers on their requested floors
 *******************************************************************************************************/

public class Elevator {
    

    /**
    * Requirement: Final static field that stores the number of passengers that the Elevator can accommodate
    */
    public static final int CAPACITY = 10;

    /**
    * Requirement: Define a field for tracking the Elevator's direction of travel
    */
    private boolean goingUp;

    /**
    * Requirement: Define an array-valued field for tracking, for each floor, the number of passengers destined for
    * that floor
    */
    private int[] passengersToFloor;

    private int numPassengers;
    
    private int passengersWaiting;

    private Building building;

    /**
    * Requirement: Replace the Elevator() constructor by Elevator(Building building)
    */
    public Elevator(Building building) {
        goingUp = true;
        numPassengers = 0;
        passengersToFloor = new int[8];
        this.building = building;
    }

    /**
    * Requirement: Return the Elevator's current floor number. I.e., this is the number of the floor reached by the last call to Elevator.move()
    */
    public int getCurrentFloor() {       
        return building.currentFloor;
    }

    /**
    * Requirement: Return the number of passengers currently on the Elevator.
    */
    public int getPassengers() {
        return this.numPassengers;
    }

    /**
    * Requirement: Define a move() method which, when called, modifies the Elevator's state
    */
    public void move() {

        if (goingUp == true) {
            //increments the current floor
            building.currentFloor++;
            //modifies the direction of travel
            if (building.currentFloor == building.FLOORS) {
                goingUp = false;
            }
        } else {
            //decrements the current floor
            building.currentFloor--;
            //modifies the direction of travel
            if (building.currentFloor == 1) {
                goingUp = true;
            }
        }
              
        if (numPassengers < CAPACITY)
        //only pick up waiting passengers when not at capacity
        {
            fillToCapacity();
        }
        else 
        {
            System.out.println("Elevator is full, no more passengers accepted");
        }
               
        //Clears the array entry tracking the number of passengers destined for the floor that the elevator
        //has just arrived at
        numPassengers = (numPassengers - passengersToFloor[building.currentFloor - 1]);
        passengersToFloor[building.currentFloor - 1] = 0;

        //prints out the status of the elevator
        this.toString();
    }

    public void fillToCapacity() {
    
         if (building.getFloor(building.currentFloor).getPassengersWaiting() > 0) 
         {
             if (building.getFloor(building.currentFloor).getPassengersWaiting() >= CAPACITY)
             {
                 this.passengersWaiting = building.getFloor(building.currentFloor).getPassengersWaiting();
                 for (int i = 1; i <=CAPACITY; i++) 
                 {
                      boardPassenger(1);
                 }
                 building.getFloor(building.currentFloor).clearPassengers(CAPACITY);  
             }
             else
             {
                 this.passengersWaiting = building.getFloor(building.currentFloor).getPassengersWaiting();
                 for (int i = 1; i <=this.passengersWaiting; i++) 
                 {
                     boardPassenger(1);
                 }
                 building.getFloor(building.currentFloor).clearPassengers(this.passengersWaiting);
             }
         }
    }
    
    /**
    * Requirement: Board a passenger who wants to ride to the indicated floor
    * this method boards a single passenger and may throw an ElevatorFullException
    * @param destinationFloor an integer indicating the destination of the incoming passenger
    */
    public void boardPassenger(int destinationFloor) {      
            passengersToFloor[destinationFloor - 1]++;
            numPassengers++;
    }

    /**
    * Requirement: indicate the number of passengers on board, and the current floor
    */
    public String toString() {
        if (numPassengers == 1) {
            return "Floor " + Integer.toString(building.currentFloor) + ": " + Integer.toString(numPassengers) + " passenger";
        } else {
            return "Floor " + Integer.toString(building.currentFloor) + ": " + Integer.toString(numPassengers) + " passengers";
        }
    }


}
