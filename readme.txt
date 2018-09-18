This is my solution for Homework 2: Expanded Elevator Model w/ Java Exceptions / Zoo animal behaviors

I solved the elevator problem by following the requirements to set the initial state of each class, then I adopted a pure test-driven development style versus writing any logic before. I found this method worked for me as I was initially overwhelmed with the task of writing logic to support somewhat complex elevator behavior. My strategy was to comment out all of the unit tests except one, then I wrote just enough logic to allow the test to pass. I dubbed this stlye of coding 'caveman logic' as I did not feel I was doing anything very intelligent, and I intended to refactor later when I had time. During this stage of development I made use of "System.out.println" regularly and we are now dear friends. It dawned on me at some point that I should probably implement a bit of inheritance between the elevator and building classes to pass around the currentFloor value with ease, but found that this could be accomplished with more caveman logic including public getters and setters. After many hours of this methodolgy I completed the tasks while keeping the requirements in mind and believe I have accounted for each of them. To make evaluation easier I have included the homework 2 requirements in the jsdocs.

I created the following classes as outlined in the requirements: Elevator, Floor, Building, ElevatorFullException
The Elevator class represents an elevator in a building that can travel up and down, stopping at floors to disembark passengers or pick them up. If a passenger tries to board a full elevator, the elevator throws an exception. The Floor class represents a single floor that the elevator can visit, it can tell the elevator how many passengers are waiting and also call the elevator. The Building class represents a building that keeps track of one elevator and multiple floors. it provides access to the elevator and floor classes for testing purposes. The ElevatorFullException class is an exception that is thrown when something out of the ordinary happens, such as a passenger trying to board a full elevator.

In order to run the unit tests, try the following:
1)unzip files
2)navigate to the directory where Murphy_Brendan_hw2.jar was saved
3)run this command to create an elevator jar:
jar -cvfm elevator.jar cscie55/hw2test/MANIFEST.MF cscie55/hw2*/*.class
4)then run this command to execute the unit tests:
java -jar elevator.jar cscie55.hw2test.ElevatorTest

If you have any problems executing the jar please email me at bjohnmurphy1984@gmail.com

Thanks, Brendan Murphy.