/*
   If base class and derived class contains a member function with same name, then we can override the base member function in the derived class using the override keyword and also need to mark the member function of base class with open keyword.
 */

import java.util.Arrays

open class A {
   open fun demo () {    // must declare open, by default function is final
      println("I am from class A")
   }

   fun showA(){
      println("I am in show A")
   }
}

class B: A(){ // inheritence using default constructor 
   override fun demo () { // Useing override keyword to override a function from supper class
      println("I am from class B")
   }

   fun showB(){
      println("I am in show B")
   }
}

fun main() {
   var  b = B()
   b.demo()
   b.showA()
   b.showB()

   var a = A()
   a.demo()
}