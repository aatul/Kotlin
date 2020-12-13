/*
 List – It is an ordered collection in which we can access to elements or items by using indices – integer numbers that define position for each element.
 
 Elements can be repeated in a list any number of times. We can perform add or remove operations in the immutable list.
 */

// An example for immutable list 
fun main() { 
    val immutableList = listOf("A","B","C") 
    // gives compile time error  
     immutableList.add = "D" 
    for(item in immutableList){ 
        println(item) 
    } 
} 