/*
    Anonymous Function
    An anonymous function is very similar to regular function except for the name of the function which is omitted from the declaration. The body of the anonymous function can be either an expression or block.

    Example 1: Function body as an expression
    fun(a: Int, b: Int) : Int = a * b

    Example 2: Function body as a block
    fun(a: Int, b: Int): Int {
        val mul = a * b
        return mul
    }

    Return type and parameters-
    1. The return type and parameters are also specified in same way as for regular function but we can omit the parameters if they can be inferred from the context.

    2. The return type of the function can be inferred automatically from the function if it is an expression and has to be specified explicitly for the anonymous function if it is body block.

    Difference between lambda expressions and anonymous functions-
    The only difference is the behavior of non-local returns. A return statement without a label always returns from the function declared with the fun keyword. This means that a return inside a lambda expression will return from the enclosing function, whereas a return inside an anonymous function will return from the anonymous function itself.
 */

// anonymous function with body as an expression 
val anonymous1 = fun(x: Int, y: Int): Int = x + y 
  
// anonymous function with body as a block 
val anonymous2 = fun(a: Int, b: Int): Int { 
            val mul = a * b 
            return mul 
            } 

fun main() { 
    //invoking funtions 
    val sum = anonymous1(3,5) 
    val mul = anonymous2(3,5) 
    println("The sum of two numbers is: $sum") 
    println("The multiply of two numbers is: $mul") 
} 