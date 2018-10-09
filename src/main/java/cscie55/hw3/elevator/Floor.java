package cscie55.hw3.elevator;


import java.util.HashSet;
import java.util.Set;

/**
 * A <code>Floor</code> object represents a getFloor in a building.
 * Each Floor object has a Floor number and tracks how many people
 * are waiting for the Elevator.
 *
 */

public class Floor {

    private int floorNumber = 0;

    private Building building;

    /**
     * HW3 Requirement: not waiting for the elevator
     */
    private Set<Passenger> residents = new HashSet<>();

    /**
     * HW3 Requirement: waiting for an Elevator going up
     */
    private Set<Passenger> upwardBound = new HashSet<>();

    /**
     * HW3 Requirement: waiting for an Elevator going down
     */
    private Set<Passenger> downwardBound = new HashSet<>();

    private int passengersWaiting = 0;

    /**
     * HW2 Requirement: a floor constructor that takes building and floornumber as parameters
     *
     *@param building - Building the structure where the elevator is
     *@param floorNumber - Int the number of the floor
     */
    Floor(Building building, int floorNumber) {
        this.building = building;
        this.floorNumber = floorNumber;
    }

    /**
     * HW3 Requirement: returns true if the passenger is resident on the Floor
     * (i.e., not waiting to go up and not waiting to go down), false otherwise
     */
    boolean isResident(Passenger passenger) {
        return true;
    }

    /**
     * HW3 Requirement: method adds a passenger to the Floor's resident
     */
    void enterGroundFloor(Passenger passenger) {

    }

    /**
     * Helper method used to decrement waiting passengers
     */
    void clearWaitingPassenger() {
        this.passengersWaiting = this.passengersWaiting - 1;
    }

    /**
     * HW3 Requirement: This allows the Floor to know which Passenger is waiting for the Elevator
     * by comparing destinationFloor to the floor number, the Floor class knows whether the Passenger is waiting to go up or down
     */
    public void waitForElevator(Passenger passenger, int destinationFloor) {

    }


}