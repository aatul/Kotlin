import kotlin.ArithmeticException 
  
fun main(){ 
    try{ 
        var num = 10 / 0
        println(num)
    } 
    catch(e: ArithmeticException){ 
        // caught and handles it 
        println("Divide by zero not allowed.") 
    } 
    println("I am executed since exception handled.")
} 