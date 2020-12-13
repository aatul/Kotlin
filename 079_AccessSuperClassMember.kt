/*
   We can also call the base class member functions or properties from the derived class using the super keyword. 
   
   In the below program we have called the base class property color and function demo() in derived class using the super keyword.
 */

open class A {
    var age = 35
    open fun demo (name:String) {    // must declare open, by default function is final
        println("Hello $name")
    }
}

class B: A(){ // inheritence using default constructor 
    fun show () {
        println("I am in Show")
        // Calling the base class member function
        super.demo("Aatul")
        // Calling the base class property
        println("Age is "+super.age)        
   }
}

fun main() {
   var  b = B()
   b.show()
}