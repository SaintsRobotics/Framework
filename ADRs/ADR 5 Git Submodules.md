# ADR 5 Git Submodules

## Context

The tools that compile the robot code and load it onto the robot are designed to load one java project. We have written a framework for robot code that is likely to be shared across all our robot code projects, and will likely receive updates. Programmers working on robot code specific to a robot sometimes fine that there are bugs in the framework that they then must fix.

## Decision

We will place the framework-specific code in another git repository. Any robot code that requires the framework will use the framework repository as a git submodule. Changes made to the framework get pushed to the submodule repository, and updates are pulled directly to the submodule.

## Status: Undergoing Review

## Consequences: Undergoing Review
