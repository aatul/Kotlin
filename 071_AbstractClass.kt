/*
    Abstract class

    In Kotlin, abstract class is declared using the abstract keyword in front of class. An abstract class can not instantiated means we can not create object for the abstract class.

    1. We can’t create an object for abstract class.
    2. All the variables (properties) and member functions of an abstract class are by default non-abstract. So, if we want to override these members in the child class then we need to use open keyword.
    3. If we declare a member function as abstract then we does not need to annotate with open keyword because these are open by default.
    4. An abstract member function doesn’t have a body, and it must be implemented in the derived class.

    Syntax:
    abstract class className(val x: String) {   // Non-Abstract Property
            
        abstract var y: Int      // Abstract Property

        abstract fun method1()   // Abstract Methods

        fun method2() {          // Non-Abstract Method
            println("Non abstract function")
        }
    }
 */

//abstract class 
abstract class Employee(val name: String,val experience: Int) {   // Non-Abstract Property

    // Abstract Property (Must be overridden by Subclasses) 
    abstract var salary: Double 
      
    // Abstract Methods (Must be implemented by Subclasses) 
    abstract fun dateOfBirth(date:String) 
  
    // Non-Abstract Method 
    fun employeeDetails() { 
        println("Name of the employee: $name") 
        println("Experience in years: $experience") 
        println("Annual Salary: $salary") 
    } 
} 

// derived class 
class Engineer(name: String,experience: Int) : Employee(name,experience) { 
    override var salary = 500000.00
    override fun dateOfBirth(date:String){ 
        println("Date of Birth is: $date") 
    } 
} 

fun main() { 
    val eng = Engineer("ABC",15) 
    eng.employeeDetails() 
    eng.dateOfBirth("22 November 1984") 
} 