/*
Enum Classes in Kotlin

In programming, sometimes there arises a need for a type to have only certain values. To accomplish this, the concept of enumeration was introduced. Enumeration is a named list of constants.
In Kotlin, like many other programming languages, an enum has its own specialized type, indicating that something has a number of possible values. Unlike Java enums, Kotlin enums are classes.

Some important points about enum classes in kotlin:
1. Enum constants aren’t just mere collections of constants- these have properties, methods etc.
2. Each of the enum constants acts as separate instances of the class and separated by commas.
3. Enums increases readability of your code by assigning pre-defined names to constants.
4. An instance of enum class cannot be created using constructors.

Enums properties and methods –
As in Java and in other programming languages, Kotlin enum classes has some inbuilt properties and functions which can be used by the programmer. Here’s a look at the major properties and methods.

Properties –
1. ordinal: This property stores the ordinal value of the constant, which is usually a zero-based index.
2. name: This property stores the name of the constant.

Methods –
2. values(): This method returns a list of all the constants defined within the enum class.
3. valueOf(): This methods returns the enum constant defined in enum, matching the input string. If the constant, is not present in the enum, then an IllegalArgumentException is thrown.
 */

enum class DAYS { 
    SUNDAY, 
    MONDAY, 
    TUESDAY, 
    WEDNESDAY, 
    THURSDAY, 
    FRIDAY, 
    SATURDAY 
} 

fun main() 
{ 
    // A simple demonstration of properties and methods 

    // val listOfValues = DAYS.values()
    for (day in DAYS.values()) { // We can pass listOfValues
        println("${day.ordinal} = ${day.name}") 
    } 
    // Check ig the given string is available in enum or not
    println("${DAYS.valueOf("WEDNESDAY")}") 
    println("${DAYS.valueOf("MyDAY")}") // It will throw an exception
} 