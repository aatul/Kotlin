/*
The in Keyword:–

If we want to assign it to the reference of its subtype then we can use the in keyword on the generic type. The in keyword can be used only on the parameter type that is consumed, not produced:

class InClass<in T> {
    fun toString(value: T): String {
        return value.toString()
    }
}
Here, we have declared a toString() method that only be consuming a value of type T. Then, we can assign a reference of type Number to the reference of its subtype – Int:

val inClassObject: InClass<Number> = InClass()
val ref<Int> = inClassObject

Note: If we have not used the in type in the above class, then given statement will produce a compiler error.

It is used to substitute a supertype value in the subtypes, i.e. the generic function/class may accept supertypes of the datatype it is already defined for, e.g. a generic class defined for Number cannot accept Int, but a generic class defined for Int can accept Number. It is implemented in Kotlin using the in keyword as follows-
 */

fun main() { 
        var a: Container<Dog> = Container<Animal>()  //compiles without error : reference obj.
        var b: Container<Animal> = Container<Dog>()  //gives compilation error 
} 

open class Animal       // super class
class Dog : Animal()    // sub class 
class Container<in T>   // generic