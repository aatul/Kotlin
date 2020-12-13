/*
 Map – Map keys are unique and holds only one value for each key, it is a set of key-value pairs. 
 
 Each key maps to exactly one value. The values can be duplicates but keys should be unique. Maps are used to store logical connections between two objects. 
 
 For example, a student ID and their name. 
 
 As it is immutable it’s size is fixed and it’s methods supports read-only access.
 */

// An example for immutable amp
fun main() { 
    var immutableMap = mapOf(9 to "A",8 to "B",7 to "C") 
    // gives compile time error 
     immutableMap.put(9,"D") 
    for(key in immutableMap.keys){ 
        println(immutableMap[key]) 
    } 
} 