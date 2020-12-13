import java.util.Arrays

fun main() {
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5, 6)

    val aLen = array1.size      // size return no. of elements in an array
    val bLen = array2.size
    val result = IntArray(aLen + bLen)  // creating array of respective size

    // System.arraycopy(sourceArray, startIndexOfSource, destinationArray, startIndex, endIndex) 
    System.arraycopy(array1, 0, result, 0, aLen)    // Copying elements of array1
    System.arraycopy(array2, 0, result, aLen, bLen) // appending elements of array2

    println(Arrays.toString(result))
}

/*
    In the above program, in order to combine/concatenate both the arrays, we copy each elements in both arrays to result by using arraycopy() function.

    The arraycopy(array1, 0, result, 0, aLen) function, in simple terms, tells the program to copy array1 starting from index 0 to result from index 0 to aLen.

    Likewise, for arraycopy(array2, 0, result, aLen, bLen) tells the program to copy array2 starting from index 0 to result from index aLen to bLen.
 */