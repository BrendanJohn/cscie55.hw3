package cscie55.hw3.elevator;



/**
 * A <code>Elevator</code> object represents an Elevator in
 * a building. 
 *
 * @author
 */

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
        fillToCapacity();
        //print the status of the elevator
        this.toString();
    }

    /**
     * Helper method to call board passenger once for each passenger waiting
     */
    void fillToCapacity() {

        this.passengersWaiting = building.getFloor(building.getCurrentFloor()).getPassengersWaiting();

        //check for waiting passengers
        if (this.passengersWaiting > 0)
        {
            //stop and pick them up
            for (int i = 1; i <=this.passengersWaiting; i++)
            {
                try
                {
                    boardPassenger(1);
                    //the passenger boarded successfully
                }
                catch (ElevatorFullException efe)
                {
                    //handle exception
                    //the passenger was unable to board because the elevator is full
                }
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
                building.getFloor(building.getCurrentFloor()).clearWaitingPassenger();
            }
        }
        catch (ElevatorFullException efe)
        {
            //handle exception
            //the passenger was unable to board because the elevator is full
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

    /**
     * Helper method to clear the array entry tracking the number of passengers destined for the floor that the
     * elevator has just arrived at
     */
    void  disembarkPassengers() {
        numPassengers = (numPassengers - passengersToFloor[building.getCurrentFloor() - 1]);
        passengersToFloor[building.getCurrentFloor() - 1] = 0;

    }


}