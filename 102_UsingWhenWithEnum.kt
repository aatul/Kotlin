/*
Usage of when expression with enum class:

A great advantage of enum classes in Kotlin comes into play when they are combined with the when expression. 

The advantage is since enum classes restrict the value a type can take, so when used with the when expression and the definition for all the constants are provided, then the need of the else clause is completely eliminated. In fact, doing so will generate a warning from the compiler.
 */

enum class DAYS{ 
    SUNDAY, 
    MONDAY, 
    TUESDAY, 
    WEDNESDAY, 
    THURSDAY, 
    FRIDAY, 
    SATURDAY; 
} 
   
fun main(){ 
    when(DAYS.SUNDAY){ 
        DAYS.SUNDAY -> println("Today is Sunday") 
        DAYS.MONDAY -> println("Today is Monday") 
        DAYS.TUESDAY -> println("Today is Tuesday") 
        DAYS.WEDNESDAY -> println("Today is Wednesday") 
        DAYS.THURSDAY -> println("Today is Thursday") 
        DAYS.FRIDAY -> println("Today is Friday") 
        DAYS.SATURDAY -> println("Today is Saturday") 
        // Adding an else clause will generate a warning 
    } 
} 