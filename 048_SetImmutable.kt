/*
 Set – It is a collection of unordered elements also it does not support duplicate elements. 
 
 It is a collection of unique elements. Generally, the order of set elements does not has significant effect. 
 
 We can not perform add or remove operations because it is immutable Set.
 */
 
// An example for immutable set 
fun main() { 
    // initialize with duplicate values but output with no repeatition 
    var immutableSet = setOf(1,2,3,4,2,"A","B") 
    // gives compile time error 
    immutableSet.add(5) 
    for(item in immutableSet){ 
        println(item) 
    } 
} 