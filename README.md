# Scala Auxiliary Constructor and Immutability Issues
This example highlights a potential issue with auxiliary constructors in Scala, specifically when dealing with immutability. While auxiliary constructors are useful in creating default object instances, their usage within mutable collection processing must be handled with care.

## Problem
The original code showcases an array of `MyClass` objects created using `map`, and it's not immediately obvious that each object within the array has its own distinct `x` value, thus not changing the original array's state, but instead producing new objects with that state.