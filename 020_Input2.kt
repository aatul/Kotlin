/*
 Taking input without using Scanner class 
 */

fun main() {

    print("Enter a number: ")

    // reads line from standard input - keyboard
    // and !! operator ensures the input is not null
    val stringInput = readLine()!!

    // converts the string input to integer
    var integer:Int = stringInput.toInt()

    // println() prints the following line to the output screen
    println("You entered: $integer")
}