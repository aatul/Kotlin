// Kotlin program of factorial using recursion 
fun Fact(num: Int):Long{ 
    return if(num==1) num.toLong()        // terminate condition 
    else num*Fact(num-1) 
} 
//main method 
fun main() { 
    println("Factorial of 5 is: "+Fact(5)) 
//Recursive call 
} 