## 1 Task Framework

## Context

Robot code almost always requires multiple components of the robot to be run concurrently or near-concurrently. Existing frameworks for writing robot code relies on game loops, which require all of the code for a component to be contained within one method that is run with no ability to delay or control code execution. The existing api for communicating with robot components is not thread-friendly, and threads may cause dangerous bugs in the way the robot executes. 

## Decision

We will build a framework for writing robot code that allowed each component to be written as a coroutine. By using coroutines, we bypass the issue of making components thread-safe, while allowing cleaner and more readable code. In addition, coroutines are easier to learn for beginner programmers, so coroutines increase the number of people that are able to work with the robot code.

## Status: Accepted

##Consequences:
 - The coroutine framework has caused some failures to fail silently, which has sometimes  complicated debugging
 - The coroutine framework is also buggier than the existing frameworks for working with the robots
 - The coroutine framework has reduced the iteration time for testing robot code
 - The coroutine framework is extremely modular, allowing more people to work on separate portions of the robot code more efficiently.
 - Many more programmers are proficient with the coroutine framework, and have contributed to the robot code in the 2017 competition season.
