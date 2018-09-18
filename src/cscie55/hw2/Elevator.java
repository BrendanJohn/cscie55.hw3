package cscie55.hw2;

/*******************************************************************************************************
 *
 * name: Brendan Murphy
 * CSCIE-55 HW 2
 * date: 09/29/2018
 *
 * Defines an elevator class that traverses a building and drops off passengers on their requested floors
 *******************************************************************************************************/

public class Elevator {
    

    /**
    * HW2 Requirement: Final static field that stores the number of passengers that the Elevator can accommodate
    */
    public static final int CAPACITY = 10;

    /**
    * HW1 Requirement: Define a field for tracking the Elevator's direction of travel
    */
    private boolean goingUp = true;;

    /**
    * HW1 Requirement: Define an array-valued field for tracking, for each floor, the number of passengers destined for
    * that floor
    */
    private int[] passengersToFloor = new int[8];

    private int numPassengers = 0;
    
    private int passengersWaiting = 0;

    private Building building;

    /**
    * HW2 Requirement: Replace the Elevator() constructor by Elevator(Building building)
    */
    public Elevator(Building building) {
        this.building = building;
    }

    /**
    * HW2 Requirement: Return the Elevator's current floor number. I.e., this is the number of the floor reached by the last call to Elevator.move()
    */
    public int getCurrentFloor() {       
        return building.getCurrentFloor();
    }

    /**
    * HW2 Requirement: Return the number of passengers currently on the Elevator.
    */
    public int getPassengers() {
        return this.numPassengers;
    }

    /**
    * HW1 Requirement: Define a move() method which, when called, modifies the Elevator's state
    */
    public void move() {

        if (goingUp == true) {
            //increments the current floor
            building.setCurrentFloor(building.getCurrentFloor() + 1);
            //modifies the direction of travel
            if (building.getCurrentFloor() == building.FLOORS) {
                goingUp = false;
            }
        } else {
            //decrements the current floor
            building.setCurrentFloor(building.getCurrentFloor() - 1);
            //modifies the direction of travel
            if (building.getCurrentFloor() == 1) {
                goingUp = true;
            }
        }
                       
        disembarkPassengers();
              
        if (numPassengers < CAPACITY)
        //only pick up waiting passengers when not at capacity
        {
            fillToCapacity();
        }
        else 
        {
            System.out.println("Elevator is full, no more passengers accepted");
        }
        //prints out the status of the elevator
        this.toString();
    }

    public void fillToCapacity() {
    
         if (building.getFloor(building.getCurrentFloor()).getPassengersWaiting() > 0) 
         {
             if (building.getFloor(building.getCurrentFloor()).getPassengersWaiting() >= CAPACITY)
             {
                 this.passengersWaiting = building.getFloor(building.getCurrentFloor()).getPassengersWaiting();
                 for (int i = 1; i <=CAPACITY; i++) 
                 {
                  try 
                  {
                     boardPassenger(1);
                     //the passenger boarded successfully
                  }
                  catch (ElevatorFullException efe)
                  {
                     //the passenger was unable to board because the elevator is full
                     System.out.println(efe.getMessage());
                  }
                 }
                 building.getFloor(building.getCurrentFloor()).clearPassengers(CAPACITY);  
             }
             else
             {
                 this.passengersWaiting = building.getFloor(building.getCurrentFloor()).getPassengersWaiting();
                 for (int i = 1; i <=this.passengersWaiting; i++) 
                 {
                  try 
                  {
                     boardPassenger(1);
                     //the passenger boarded successfully
                  }
                  catch (ElevatorFullException efe)
                  {
                     //the passenger was unable to board because the elevator is full
                     System.out.println(efe.getMessage());
                  }
                 }
                 building.getFloor(building.getCurrentFloor()).clearPassengers(this.passengersWaiting);
             }
         }
    }
    
    /**
    * HW2 Requirement: Board a passenger who wants to ride to the indicated floor
    * this method boards a single passenger and may throw an ElevatorFullException
    * @param destinationFloor an integer indicating the destination of the incoming passenger
    */
    public void boardPassenger(int destinationFloor) throws ElevatorFullException {      
            try 
            {
                if (numPassengers == 10) 
                {
                    throw new ElevatorFullException("Elevator is at capacity");
                }
                else
                {
                    passengersToFloor[destinationFloor - 1]++;
                    numPassengers++;
                    System.out.println("passenger boarded");
                
                }
            }
            catch (ElevatorFullException efe)
            {
                System.out.println(efe);               
            }
            finally
            {
                System.out.println("passenger boarded");  
            }

    }

    /**
    * HW1 Requirement: indicate the number of passengers on board, and the current floor
    */
    public String toString() {
        if (numPassengers == 1) {
            return "Floor " + Integer.toString(building.getCurrentFloor()) + ": " + Integer.toString(numPassengers) + " passenger";
        } else {
            return "Floor " + Integer.toString(building.getCurrentFloor()) + ": " + Integer.toString(numPassengers) + " passengers";
        }
    }
    
    public void  disembarkPassengers() {         
        //Clears the array entry tracking the number of passengers destined for the floor that the elevator
        //has just arrived at
        System.out.println(passengersToFloor[building.getCurrentFloor() - 1] + " passengers departed");
        numPassengers = (numPassengers - passengersToFloor[building.getCurrentFloor() - 1]);
        passengersToFloor[building.getCurrentFloor() - 1] = 0;
        
    }


}
