This is my solution for Homework 2: Expanded Elevator Model w/ Java Exceptions / Zoo animal behaviors

I made no assumption when solving the problem. I solved the problem by following the instructions and creating an algorithm that
does x y and z.

To solve this problem I created the following classes: Elevator, Floor, Building, ElevatorFullException
The Elevator class represents an elevator in a building that can travel up and down, stopping at floors to disembark passengers
or pick them up. If a passenger tries to board a full elevator, the elevator throws an exception. The Floor class 
represents a single floor that the elevator can visit, it can tell the elevator how many passengers are waiting and also
call the elevator. The Building class represents a building that keeps track of one elevator and multiple floors. it provides
access to the elevator and floor classes for testing purposes. The ElevatorFullException class is an exception that is thrown
when something out of the ordinary happens, such as a passenger trying to board a full elevator.

They have been packaged up into a jar file that you can download and execute with the following command:

java -cp hw1.jar cscie55.hw1.elevatorTest.ElevatorTest

From the directory location of the jar file. This will allow you to see the output of my elevator test file.

If you have any problems executing the jar please email me at bjohnmurphy1984@gmail.com

Thanks, Brendan Murphy.