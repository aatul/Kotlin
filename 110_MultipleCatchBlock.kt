import java.util.Scanner 

fun main() { 
    val sc = Scanner(System.`in`) 
    try { 
        print("Enter the value:")
        val n = Integer.parseInt(sc.nextLine()) 
        if (512 % n == 0) 
            println("$n is a factor of 512") 
        else
            println("$n is not a factor of 512") 
    } catch (e: ArithmeticException) { 
        println(e) 
    } catch (e: NumberFormatException) { 
        println(e) 
    } 
}     
