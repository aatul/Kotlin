import java.util.Scanner

fun main() {
    print("Enter the character: ")
    val scanner = Scanner(System.`in`)
    val ch = scanner.next().single()
    println("You entered $ch")
}