/*
    If the derived class does not contains primary constructor, we need to call the base class secondary constructor from the secondary constructor of derived class using the super keyword. We also need to initialize the base class secondary constructor using the parameters of derived class.
 */

//base class 
open class Employee { 
    constructor(name: String,age: Int){ 
            println("Name of the Employee is $name") 
            println("Age of the Employee is $age") 
    } 
} 

// derived class 
class CEO : Employee{ 
    constructor( name: String,age: Int, salary: Double): super(name,age) { 
        println("Salary per annum is $salary million dollars") 
    } 
} 

fun main() { 
    CEO("Aatul Palandurkar", 35, 500000.00)
} 