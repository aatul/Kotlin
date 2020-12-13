// Kotlin program of factorial using recursion 
fun Fact(num: Int):Long{ 
    return  num*Fact(num-1)  // no terminate condition 
}     
//main method 
fun main() { 
    println("Factorial of 5 is: "+Fact(5)) 
//Recursive call 
} 
// This program may throw an java.lang.StackOverflowError