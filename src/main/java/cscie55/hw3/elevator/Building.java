package cscie55.hw3.elevator;

/**
 * A <code>Building</code> object represents Building. A building
 * has an Elevator objects as well as a number of FLOORS as defined
 * in a static int. A building knows the state of each Floor object as
 * well as it's Elevator.
 *
 *
 */

public class Building {

    /**
     * HW2 Requirement: A static final field storing the number of floors in the building
     */
    public static final int FLOORS = 7;

    private Floor[] floors = new Floor[FLOORS + 1];;

    /**
     * Requirement: Define a field for tracking the Elevator's current floor
     */
    private int currentFloor = 1;

    private Elevator elevator;


    /**
     * HW2 Requirement: The Building constructor creates an Elevator, and one floor for each floor number
     * (Move the variable currentFloor that was in the Elevator class in homework 1 to the Building class.)
     */
    public Building() {
        Elevator elevator = new Elevator(this);
        this.elevator = elevator;
        for (int i = 1; i <=FLOORS; i++) {
            Floor floor = new Floor(this, i);
            this.floors[i] = floor;
        }
    }

    /**
     * HW2 Requirement: Returns the building's Elevator
     */
    public Elevator getElevator() {
        return this.elevator;
    }

    /**
     * HW2 Requirement: Returns the Floor object for the given floor number
     *@param floorNumber - Int the number of the floor
     */
    public Floor getFloor(int floorNumber) {
        return this.floors[floorNumber];
    }

    /**
     * Gets the current floor number
     */
    int getCurrentFloor() {
        return this.currentFloor;
    }

    /**
     * Sets the current floor number
     */
    void setCurrentFloor(int floorNum) {
        this.currentFloor = floorNum;
    }

}