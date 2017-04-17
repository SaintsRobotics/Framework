# 2 Motor Groups

## Context
The apis for working with the robot provide objects capable of interfacing with the motors of the robot. These apis encourage the creation of separate objects for each motor, and will fail if two motor objects trying to access the same motor are created. In addition, each motor object directly references the port where it communicates with the motor, without a central location to change.

## Decision
We will write a class that encapsulates all motors into Motor Groups. Motor Groups are an object that contain a set of motors. The motor group can change the speed of all the motors in it, and only all the motors in it. A motor may belong to more than one motor group. One class contains static references to all motor groups, and the motor groups are accessed through this class. In this class, motor groups will be given descriptive names. Programmers accessing motor groups will not be concerned with which exact motors they are controlling, but will simply know that a motor group contains all the motors that fit a certain description. All references to specific ports will be stored in the motor groups.

## Status: Accepted

## Consequences:
 
 - Code accessing motors is shorter and clearer
 - All motors are in the same area in the code, resulting in easier changes
