fun main(){
    operator fun Int.times(str: String) = str.repeat(this)       
    println(2 * "Hello")                                          

    operator fun String.get(range: IntRange) = substring(range)  
    val str = "You are the creator of your own destiny."
    println(str[0..15])      
}

/*
    Certain functions can be "upgraded" to operators, allowing their calls with the corresponding operator symbol.

    1. This takes the infix function from above one step further using the operator modifier.
    2. The operator symbol for times() is * so that you can call the function using 2 * "Bye".
    3. An operator function allows easy range access on strings.
    4. The get() operator enables bracket-access syntax.
 */