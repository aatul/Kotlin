/*
This type of class is used to represent a restricted class hierarchy. Sealed allows the developers to maintain a data type of a predefined type. 

To make a sealed class, we need to use the keyword “sealed” as a modifier of that class. A sealed class can have its own subclass but all those subclasses need to be declared inside the same Kotlin file along with the sealed class.

The sealed classes have their constructors are private by default.

A sealed class is implicitly abstract and hence it cannot be instantiated.
 */

sealed class Demo {
   class OP1 : Demo() // Demo class can be of two types only
   class OP2 : Demo()
}

fun main() {
   val obj: Demo = Demo.OP2() 
   
   val output = when (obj) { // defining the object of the class depending on the inuputs 
      is Demo.OP1 -> "Option One has been chosen"
      is Demo.OP2 -> "option Two has been chosen"
   }
   
   println(output)
}