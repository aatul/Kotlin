/*
The out Keyword:

1. When we want to assign the generic type to any of its super type, then we need to use “out” keyword.
2. When we want to assign the generic type to any of its sub-type, then we need to use “in” keyword. 

Syntax:
class OutClass<out T>(val value: T) {
    fun get(): T {
        return value
    }
}
Above, we have defined an OutClass class that can produce a value of type T. Then, we can assign an instance of the OutClass to the reference that is a supertype of it:

val out = OutClass("string")
val ref: OutClass<Any> = out    

Note: If we have not used the out type in the above class, then given statement will produce a compiler error.

In the following example, we will use “out” keyword. Similarly, you can try using “in” keyword.
 */

fun main() {
   var obj1 = GenericsExample<Int>(10)
   var obj2 = GenericsExample<Double>(10.00)
   println(obj1)
   println(obj2)
}

class GenericsExample<out T>(input:T) {
   init {
      println("Called with the value "+input)
   }
}