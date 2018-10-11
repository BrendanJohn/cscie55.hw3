package cscie55.hw3.elevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * A <code>Elevator</code> object represents an Elevator in
 * a building.
 *
 * @Brendan Murphy
 */

public class Elevator {

	/**
	 * HW2 Requirement: Final static field that stores the number of passengers that the Elevator can accommodate
	 */
	public static final int CAPACITY = 10;

	/**
	 * HW1 Requirement: Define a field for tracking the Elevator's direction of travel
	 */
	private boolean goingUp = true;

    /**
     * HW1 Requirement: Define an array-valued field for tracking, for each floor, the number of passengers destined for
     * that floor
     */
    private int[] passengersToFloor = new int[8];

    /**
     * Requirement: Define a field for tracking the Elevator's current floor
     */
    private int currentFloor = 1;

    private Set<Passenger> passengers = new HashSet<>();

    private Set<Passenger> boardingPassengers = new HashSet<>();

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
    int getCurrentFloor() {
        return this.currentFloor;
    }

    /**
     * Returns a set of passengers currently on board the elevator
     */
    public Set<Passenger> getPassengers() {

    	return this.passengers;
    }

    /**
     * HW3 Requirement: Return true if the elevator is going up, false otherwise
     */
    public	boolean goingUp() {
        if (this.goingUp == true) {
        	return true;
		}
		else {
        	return false;
		}
    }

    /**
     * HW3 Requirement: Return true if the elevator is going down, false otherwise
     */
    public	boolean goingDown(){
		if (this.goingUp == false) {
			return true;
		}
		else {
			return false;
		}
	}

    /**
     * HW1 Requirement: Define a move() method which, when called, modifies the Elevator's state
     */
    public void move() {

        if (goingUp()) {
        	//travel up one floor
			this.currentFloor++;
			disembarkPassengers(this.passengers);
            requestUpwardPassengers(building.getFloor(this.currentFloor));
            fillToCapacity(this.boardingPassengers);
            //modifies the direction of travel
            if (this.getCurrentFloor() == building.FLOORS) {
                goingUp = false;
            }
        }
        else {
        	//travel down one floor
			this.currentFloor--;
        	disembarkPassengers(this.passengers);
            requestDownwardPassengers(building.getFloor(this.currentFloor));
            fillToCapacity(this.boardingPassengers);
            //modifies the direction of travel
            if (this.getCurrentFloor() == 1) {
				requestUpwardPassengers(building.getFloor(this.currentFloor));
				fillToCapacity(this.boardingPassengers);
                goingUp = true;
            }
        }

        //print the status of the elevator
        this.toString();
    }

    /**
     * Helper method to clear the array entry tracking the number of passengers destined for the floor that the
     * elevator has just arrived at
     */
    void  disembarkPassengers(Set leavingPassengers) {
		int currentFloor = this.getCurrentFloor();
		//iterates over set passengers and removes them if destination floor matches current floor
		Iterator<Passenger> passenger = leavingPassengers.iterator();
		while (passenger.hasNext()) {
			Passenger person = passenger.next();
			if (person.destinationFloor()  == currentFloor) {
				person.arrive();
				passenger.remove();
				passengersToFloor[this.getCurrentFloor()] = passengersToFloor[this.getCurrentFloor()] - 1;
				//add disembarked passenger to list of floor residents
				building.getFloor(this.currentFloor).addResident(person);
			}
		}
    }

    /**
     * Helper method asks the Floor for a collection of Passengers waiting for upward service
     */
    void requestUpwardPassengers(Floor floor) {
        this.boardingPassengers = floor.getUpwardPassengers();
    }

    /**
     * Helper method asks the Floor for a collection of Passengers waiting for downward service
     */
    void requestDownwardPassengers(Floor floor) {
        this.boardingPassengers = floor.getDownwardPassengers();
    }

    /**
     * Helper method to call board passenger once for each passenger waiting
     */
    void fillToCapacity(Set boardingPassengers) {
		List<Passenger> passengerArrayList = new ArrayList<Passenger>(boardingPassengers);
		Collections.sort(passengerArrayList);
		Iterator<Passenger> passenger = passengerArrayList.iterator();
        while(passenger.hasNext()){
            try
            {
            	boardPassenger(passenger.next());
                //the passenger boarded successfully
            }
            catch (ElevatorFullException efe)
            {
                System.out.println("No more passengers");
                //handle exception
                //the passenger was unable to board because the elevator is full
            }
        }

    }

    /**
     * Board a passenger who wants to ride to the indicated floor
     * this method boards a single passenger and may throw an ElevatorFullException
     * @param boardingPassenger a passenger who wants to ride to the indicated floor
     */
    public void boardPassenger(Passenger boardingPassenger) throws ElevatorFullException {
        try
        {
            if (passengers.size() >= 10)
            {
                throw new ElevatorFullException("Elevator is at capacity");
            }
            else
            {
                boardingPassenger.boardElevator();
            	passengers.add(boardingPassenger);
                boardingPassengers.remove(boardingPassenger);
                passengersToFloor[boardingPassenger.destinationFloor()]++;
                //building.getFloor(building.getCurrentFloor()).clearWaitingPassenger();
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
        if (goingDown()) {
			if (this.passengers.size() > 1) {
				return "Elevator is on floor " + Integer.toString(this.getCurrentFloor()) + ", heading down with " + Integer.toString(this.passengers.size()) + " passengers";
			} else {
				return "Elevator is on floor " + Integer.toString(this.getCurrentFloor()) + ", heading down with no passengers";
			}
		}
		else {
			if (this.passengers.size() > 1) {
				return "Elevator is on floor " + Integer.toString(this.getCurrentFloor()) + ", heading up with " + Integer.toString(this.passengers.size()) + " passengers";
			} else {
				return "Elevator is on floor " + Integer.toString(this.getCurrentFloor()) + ", heading up with no passengers";
			}
		}

    }

}