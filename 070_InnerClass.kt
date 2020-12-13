/*
   When we can declare a class inside another class using the keyword inner then it is called inner class. With the help of inner class we can access the outer class property inside the inner class.

   First, use inner keyword in front of inner class. Then, create an instance of the outer class else we can’t use inner classes.

   Here, welcomeMessage is in outer class, we can access that if inner keyword is used otherwise it will throw an error.

   Kotlin Inner Class = Java Non-Static Nested Class
 */

fun main() {
   val demo = Outer().Nested().greeting() // calling nested class method
   print(demo)
}

class Outer {
   private val welcomeMessage: String = "Hey, welcome to the world of Kotlin."
   
   inner class Nested {
      fun greeting() = welcomeMessage
   }
}