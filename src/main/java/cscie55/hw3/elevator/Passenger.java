package cscie55.hw3.elevator;

/**
 * A <code>Passenger</code> object represents a person to ride the Elevator.
 * a passengers has a ID number, knows its current Floor and its destination Floor.
 *
 * @Brendan Murphy
 */

public class Passenger implements Comparable<Passenger> {

	private int id = 0;

	private int destinationFloor = 0;

	private int currentFloor = 0;

	static final int UNDEFINED_FLOOR = -1;

	public int compareTo(Passenger p)
	{
		return this.id - p.id;
	}

	/**
	 * HW3 Requirement: a passenger constructor that takes an id as a parameter
	 *
	 *@param id - Int that will be useful in debugging
	 */
	public Passenger(int id) {
		this.id = id;
	}

	/**
	 * HW3 Requirement: Returns the Passenger's current floor
	 *
	 */
	public int currentFloor() {
		return this.currentFloor;
	}

	/**
	 * HW3 Requirement: Returns the Passenger's destination floor
	 *
	 */
	public int destinationFloor() {
		return this.destinationFloor;
	}

	/**
	 * HW3 Requirement: Sets the Passenger's destination floor
	 * @param newDestinationFloor - Int that indicates a new destination floor
	 *
	 */
	public void waitForElevator(int newDestinationFloor) {
        this.destinationFloor = newDestinationFloor;
	}

	/**
	 * HW3 Requirement: Sets the Passenger's current floor number to be undefined
	 *
	 */
	public void boardElevator() {
        this.currentFloor = UNDEFINED_FLOOR;
	}

	/**
	 * HW3 Requirement: The Passenger is on an Elevator and arrives at the destination
	 *
	 */
	public void arrive() {
		this.currentFloor = this.destinationFloor;
		this.destinationFloor = UNDEFINED_FLOOR;
	}

	/**
	 * HW3 Requirement: method to aid in debugging
	 */
	public String toString() {
		return "Passenger " + (this.id) + " has a destination floor of: " + (this.destinationFloor);
	}
}