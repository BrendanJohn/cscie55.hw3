package cscie55.hw2;

/*******************************************************************************************************
 *
 * name: Brendan Murphy
 * CSCIE-55 HW 2
 * date: 09/25/2018
 *
 * Defines an elevatorFullException class that must be thrown when something out of the ordinary happens
 *******************************************************************************************************/

public class ElevatorFullException extends Exception  {

    public ElevatorFullException() {
        //sends a string as a message to the super class
        super("The elevator is full");
    }

  }
