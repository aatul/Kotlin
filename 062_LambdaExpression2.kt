/*
 Return String value than we can do it with help of toString() inbuilt function.
 */
val sum1 = { a: Int, b: Int -> 
    val num = a + b 
    num.toString()     //convert Integer to String 
} 

fun main() { 
    val result1 = sum1(2,3) 
    println("The sum of two numbers is: $result1") 
} 