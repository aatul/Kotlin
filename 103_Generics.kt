/*
Generics is pretty similar to Java but Kotlin developer has introduced two new keywords “out” and “in” to make Kotlin codes more readable and easy for the developer.

In Kotlin, a class and a type are totally different concepts. As per the example, List is a class in Kotlin, whereas List<String> is a type in Kotlin. 

The following example depicts how generics is implemented in Kotlin:-
Generic class is defined as follows:
class MyClass<T>(text: T) {
    var name = text
}

To create an instance of such a class, we need to provide the type arguments:
val my : MyClass<String> = Myclass<String>("ABC")

Advantages of generics:–
1. Type casting is evitable- No need to typecast the object.
2. Type safety- Generic allows only single type of object at a time.
3. Compile time safety- Generics code is checked at compile time for the parameterized type so that it avoids run time error.
 */

fun main() {
   var obj1 = GenericsExample<String>("JAVA")
   var obj2 = GenericsExample<Int>(14)
}

class GenericsExample<T>(input:T) {
   init {
      println("Called with the value "+input)
   }
}