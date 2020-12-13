// Map – It is mutable so it supports functionalities like put, remove, clear etc.

fun main(args : Array<String>) { 
    var mutableMap = mutableMapOf<Int,String>(1 to "A",2 to "B",3 to "C") 
    // Print the original map
    println("Original Map:")
    for(item in mutableMap.values){ 
        println(item) 
    } 

    // we can modify/replace the element 
    mutableMap.put(1,"D") 
    // add one more element in the list 
    mutableMap.put(4,"E") 
    println("Updated Map:")
    for(item in mutableMap.values){ 
        println(item) 
    } 
} 