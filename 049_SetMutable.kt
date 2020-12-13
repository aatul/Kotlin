/*
 The mutable Set supports both read and write functionality. We can access add or remove elements from the collections easily and it will preserve the order of the elements.
 */

// An example for mutable set
fun main() { 
    var mutableSet = mutableSetOf<Int>(1,2) 
    // adding elements in set 
    mutableSet.add(3) 
    mutableSet.add(4) 
    mutableSet.add(4) 
    for(item in mutableSet){ 
        println(item) 
    } 
} 