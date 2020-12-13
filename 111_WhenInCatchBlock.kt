import java.lang.NumberFormatException 
import java.util.Scanner 

fun main() { 
    val sc = Scanner(System.`in`) 
    try { 
        print("Enthe the value: ")
        val n = Integer.parseInt(sc.nextLine()) 
        if (512 % n == 0) 
        println("$n is a factor of 512") 
    } catch (e: Exception ) { // Generalized Exception
        when(e){ 
            is ArithmeticException -> { println("Arithmetic Exception: Divide by zero") } 
            is NumberFormatException -> { println("Number Format Exception") } 
        } 
    } 
}