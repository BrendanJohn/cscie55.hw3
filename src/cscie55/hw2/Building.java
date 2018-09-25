package cscie55.hw2;

/*******************************************************************************************************
 *
 * name: Brendan Murphy
 * CSCIE-55 HW 2
 * date: 09/16/2018
 *
 * Defines an building class that keeps track of one elevator and multiple floors
 *******************************************************************************************************/

public class Building {

    /**
    * Requirement: A static final field storing the number of floors in the building
    */
    static final int FLOORS = 7;

    /**
    * Requirement: The Building constructor creates an Elevator, and one floor for each floor number
    * (Move the variable currentFloor that was in the Elevator class in homework 1 to the Building class.)
    */
    public Building() {

    }

    /**
    * Requirement: Returns the building's Elevator
    */
    public Elevator getElevator() {
        return elevator;
    }

    /**
    * Requirement: Returns the Floor object for the given floor number
    */
    public Floor getFloor(int floorNumber) {
        reurn floor;
    }

  }
