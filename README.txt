This is my solution for Homework #3: Active Passengers, Collections

I solved the active passengers and collections problem by following the requirements to set the initial state of each class, then I adopted a pure test-driven development style versus writing any logic before.
This was more or less a similar approach that I took with homework 2, however the unit tests in homework 3 are larger and required more design decisions upfront. The first decision I made was on the type
of collection I would use to capture the three difference passenger buckets. Although the ArrayList collection is effecient, I found that it did not capture my needs in the design of the prgram. Each passenger
has an id, a destination floor and a current floor. These three properties are more in line with an object versus a key/value pair and therefore the HashSet collection is a more suitable mechanism for storing
and operating on complex objects. By using this methodolgy and design decisions I completed the tasks while keeping the requirements in mind and believe I have accounted for each of them.
To make evaluation easier I have called out the homework 3 requirements in the jsdocs of each class.

In addition to the homework 2 classes outlined below, I have also implemented the passenger class which is in line with the requirements.
The Passenger class represents a person to ride the Elevator.
The Elevator class represents an elevator in a building that can travel up and down, stopping on floors to disembark passengers or pick them up.
If a passenger tries to board a full elevator, the elevator throws an exception.
The Floor class represents a single floor that the elevator can visit, it can tell the elevator how many passengers are waiting and also call the elevator.
The Building class represents a building that keeps track of one elevator and multiple floors.
The ElevatorFullException class is an exception that is thrown when something out of the ordinary happens, such as a passenger trying to board a full elevator.

In order to run the unit tests, try the following:
1)unzip files
2)navigate to the directory where Murphy_Brendan_hw2.jar was saved
3)run this command to create an elevator jar:
jar -cvfm elevator.jar cscie55/hw2test/MANIFEST.MF cscie55/hw2*/*.class
4)then run this command to execute the unit tests:
java -jar elevator.jar cscie55.hw2test.ElevatorTest

Thanks, Brendan Murphy.

