/*
    WAP to check the number of occurances/frequency of a character in a String
 */
fun main() {
    val str = "Kotlin is official language for Android"
    val ch = 'o'
    var count = 0

    for (i in 0..str.length - 1) {
        if (ch == str[i]) {
            ++count
        }
    }

    println("Count of $ch = $count")
}