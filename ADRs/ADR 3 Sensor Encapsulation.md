#3 Sensor encapsulation

## Context
The apis provided with the robot provide objects that can access sensor data. Not all of these objects are compatible with the sensors we use. Many provide raw sensor data, such as voltages, which require calculations before useful data, such as distance or angle, can be provided

## Decision
We will write a class that contains methods for accessing sensor data. We will write this class in a well-encapsulated way, meaning the details of how raw sensor data is transformed into useful data is not exposed.

## Status: accepted

## Consequences:

	- No code that controls robot behavior concerns itself with transforming raw sensor data into useful sensor data, making robot code easier to write
