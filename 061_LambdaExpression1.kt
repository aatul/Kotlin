/*
 Lambdas expression and Anonymous function both are function literals means these functions are not declared but passed immediately as an expression.

 In Kotlin lambdas is similar to Java Lambdas. A function without name is called anonymous function. For lambda expression we can say that it is anonymous function.

 Syntax:
 val lambda_name : Data_type = { argument_List -> code_body }
 */
 
// with type annotation in lambda expression 
val sum1 = { a: Int, b: Int -> a + b } 
  
// without type annotation in lambda expression 
val sum2:(Int,Int)-> Int  = { a , b -> a + b} 
  
fun main() { 
    val result1 = sum1(2,3) 
    val result2 = sum2(3,4) 
    println("The sum of two numbers is: $result1") 
    println("The sum of two numbers is: $result2") 
  
    // directly print the return value of lambda 
    // without storing in a variable. 
    println(sum1(5,7)) 
} 