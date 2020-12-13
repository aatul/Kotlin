/*
Protected is another access modifier for Kotlin, which is currently not available for top level declaration like any package cannot be protected. 

A protected class or interface is visible to its subclass only.
 */

open class A() {
   protected val i = 1
}

class B : A() {
   fun getValue() : Int {
      return i
   }
}