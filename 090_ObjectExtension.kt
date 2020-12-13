/*
Kotlin provides another mechanism to implement static functionality of Java. This can be achieved using the keyword “companion object”.

Using this mechanism, we can create an object of a class inside a factory method and later we can just call that method using the reference of the class name. In the following example, we will create a “companion object”.
 */

fun main() {
   println("Hey, "+A.show())
}

class A {
   companion object {
      fun show():String {
         return("You are learning Kotlin from Aatul Palandurkar")
      }
   }
}