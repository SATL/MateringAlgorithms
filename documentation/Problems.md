
## Closest two sum
 Given 2 arrays a & b, find the closets sum of 2 values ( every value for one array which is closest to a target number
 
### Algorithm
* Add array a to a Set
* Iterate over array b and try to find a
* If found return the elements
* If not found Iterate again but increment the differenece by 1

[Java Implementation](../src/problems/arrays/Closest2Sum.java)


## Search in a bitonic array.
An array is bitonic if it is comprised of an increasing sequence of integers followed immediately by a decreasing sequence of integers. Write a program that, given a bitonic array of nn distinct integer values, determines whether a given integer is in the array.
### Algorithm
* Binary search to find highest element
    * Go to middle
    * If [middle] < [middle-1] && [middle] < [ middle +1] return middle
    * If [middle] < [ middle -1 ] return left part
    * If [middle] < [ middle +1 ] return right part
* Binary search left part from 0 to highest value
* Binary search right part from highest part to length
[Java Implementation](../src/problems/arrays/SearchBitonic.java)
