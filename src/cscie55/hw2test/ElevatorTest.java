package cscie55.hw2test;

import cscie55.hw2.Elevator;
/*******************************************************************************************************
 *
 * name: Brendan Murphy
 * CSCIE-55 HW 2
 * date: 09/25/2018
 *
* Defines an elevator test class that tests the elevator class
 *******************************************************************************************************/

public class ElevatorTest {
    public static void main(String argv[]) {

    /**
    * Requirement: Creates a new elevator object
    */
    Elevator elevator = new Elevator();

    //Requirement: Board two passengers for the 3nd floor, and one for the 5th floor.
    elevator.boardPassenger(3);
    elevator.boardPassenger(3);
    elevator.boardPassenger(5);

    //Requirement: Print the state of the elevator before the first move
    System.out.println(elevator.toString());

    //Requirement: Move the Elevator from the ground floor to the top floor, and then back to the ground floor.
    for (int i = 1; i <= 12; i++)
    {
     elevator.move();
     //Requirement: Print the state of the elevator after each move
     System.out.println(elevator.toString());
    }
   }
}
