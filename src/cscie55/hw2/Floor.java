package cscie55.hw2;

/*******************************************************************************************************
 *
 * name: Brendan Murphy
 * CSCIE-55 HW 2
 * date: 09/25/2018
 *
 * Defines a floor class that that represents one of the floors an elevator can visit
 *******************************************************************************************************/

public class Floor {

    private int floorNumber = 0;
    
    private Building building;
    
    private int passengersWaiting = 0;
    
    /**
    * Requirement: a floor constructor that takes building and floornumber as parameters
    *
    *@param building - Building the structure where the elevator is
    *@param floorNumber - Int the number of the floor
    */
    Floor(Building building, int floorNumber) {
        this.building = building;
        this.floorNumber = floorNumber;
    }

    /**
    * Requirement: Returns the number of passengers on the Floor who are waiting for the Elevator
    */
    public int getPassengersWaiting() {
        return this.passengersWaiting;
    }
    
     public void clearPassengers(int boardedPassengers) {
         this.passengersWaiting = this.passengersWaiting - boardedPassengers;
     }

    /**
    * Requirement: Called when a passenger on the Floor wants to wait for the Elevator
    * Calling this should cause the Elevator to stop the next time it moves to the Floor
    */
    public void waitForElevator() {
        passengersWaiting++;
    }


}
