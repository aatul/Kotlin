import java.util.Arrays

fun main() {
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5, 6)

    val length = array1.size + array2.size

    // Define an array of given size
    val result = IntArray(length)
    var pos = 0

    // Copying elements from array1
    for (element in array1) {
        result[pos] = element
        pos++
    }

    // Copying elements from array1, appending to result array after copying array1
    for (element in array2) {
        result[pos] = element
        pos++
    }

    println(Arrays.toString(result))
}