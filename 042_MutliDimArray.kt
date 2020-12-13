import java.util.Arrays

fun main() {
    // Define Multidimentional Array or Nested Array
    val array = arrayOf(intArrayOf(1, 2),
                        intArrayOf(3, 4),
                        intArrayOf(5, 6, 7))

    println(Arrays.deepToString(array))
    println(Arrays.toString(array))
}

/*
In the above program, since each element in array contains another array, just using Arrays.toString() prints the address of the elements (nested array).

To get the numbers from the inner array, we use another function Arrays.deepToString(). This gives the numbers 1, 2 and so on, we are looking for.

This function works for  3-dimensional arrays as well.
 */