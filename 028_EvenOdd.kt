/*
    Bad Programming Practise:
    1. Never use * in import statement because it will load all the classes from that package and increases runtime memory
    2. Always call the specific class from the package.
 */

import java.util.*

fun main() {

    val reader = Scanner(System.`in`)

    print("Enter a number: ")
    val num = reader.nextInt()

    if (num % 2 == 0)
        println("$num is even")
    else
        println("$num is odd")
}
