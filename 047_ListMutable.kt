/*
 Since mutable list supports read and write operation, declared elements in the list can either be removed or added.
 */

// An example for mutable list 
fun main() { 
    var mutableList = mutableListOf("A","B","C") 
    // Print original list
    println("Original List:")
    for(item in mutableList){ 
        println(item) 
    }
    // we can modify/replace the element 
    mutableList[0] = "D"
    // add one more element in the list 
    mutableList.add("E") 
    println("Updated List:")
    for(item in mutableList){ 
        println(item) 
    }
} 