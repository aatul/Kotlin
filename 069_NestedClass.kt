/*
   Nested Class
   A class is declared within another class then it is called as nested class. By default nested class is static so we can access the nested class property or variables using dot(.) notation without creating object of the class.

   Nested class can’t access the members of outer class, but we can access the property of nested class from the outer class without creating object for nested class.

   Kotlin Nested Class = Java Static Nested Class
 */

fun main() {
   val demo = Outer.Nested().demo() // calling nested class method
   print(demo)
}

class Outer {
   //private val welcomeMessage: String = "Hey, welcome to the world of Kotlin."
   class Nested {
      fun demo() = "Hope you are finding KOTLIN easy?"
   }
}