# Groovy NullPointerException in Map Iteration

This example demonstrates a common error in Groovy when working with Maps and null values. The `myMethod` function attempts to iterate over a map, but if a null map is passed, a `NullPointerException` occurs. This is because the `each` method cannot handle null values directly.

## Solution
The solution involves adding a null check before iterating over the map to prevent the `NullPointerException`. 