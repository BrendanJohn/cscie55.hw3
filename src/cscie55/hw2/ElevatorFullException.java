package cscie55.hw2;

/*******************************************************************************************************
 *
 * name: Brendan Murphy
 * CSCIE-55 HW 2
 * date: 09/29/2018
 *
 * Defines an elevatorFullException class that must be thrown when something out of the ordinary happens
 *******************************************************************************************************/

public class ElevatorFullException extends Exception  {

    /**
    * HW2 Requirement: an elevatorFullException class that is thrown when something out of the ordinary happens
    */
    public ElevatorFullException(String message) {
        //sends a string as a message to the super class
        super(message);
    }

  }
