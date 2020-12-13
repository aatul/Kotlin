/*
    Inheritance

    In Kotlin, all classes are final by default. To inherit, base class for derived class we should use open keyword in front of base class.

    Syntax
    open class baseClass (x:Int ) {
        ..........
    }
    class derivedClass(x:Int) : baseClass(x) {
        ...........
    }
 */

import java.util.Arrays

open class A {  // must declare open, by default class is final
   fun demo () {
      print("I am from class A")
   }
}

class B: A(){   // inheritence using default constructor 
}

fun main() {
   var  b = B()
   b.demo()
}