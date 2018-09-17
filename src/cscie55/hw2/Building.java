package cscie55.hw2;

/*******************************************************************************************************
 *
 * name: Brendan Murphy
 * CSCIE-55 HW 2
 * date: 09/25/2018
 *
 * Defines an building class that keeps track of one elevator and multiple floors
 *******************************************************************************************************/

public class Building {

    /**
    * Requirement: A static final field storing the number of floors in the building
    */
    public static final int FLOORS = 7;

    /**
    * Requirement: Define a field for tracking the Elevator's current floor
    */
    public int currentFloor = 1;

    /**
    * Requirement: The Building constructor creates an Elevator, and one floor for each floor number
    * (Move the variable currentFloor that was in the Elevator class in homework 1 to the Building class.)
    */
    public Building() {
        Building building = new Building();
        Elevator elevator = new Elevator(building);
    }

    /**
    * Requirement: Returns the building's Elevator
    */
    public Elevator getElevator() {
        return null;
    }

    /**
    * Requirement: Returns the Floor object for the given floor number
    *@param floorNumber - Int the number of the floor
    */
    public Floor getFloor(int floorNumber) {
        return null;
    }

  }
