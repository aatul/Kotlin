fun main() {
    val rows = 2
    val columns = 3
    val firstMatrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))
    val secondMatrix = arrayOf(intArrayOf(10, 20, 30), intArrayOf(40, 50, 60))

    // Define empty multidimentional array
    val sum = Array(rows) { IntArray(columns) }

    // Adding Two matrices
    for (i in 0..rows - 1) {        // for(i=0; i<rows-1; i++)
        for (j in 0..columns - 1) {
            sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j]
        }
    }

    // Displaying the result
    println("Sum of two matrices is: ")
    for (row in sum) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
}

/*
In the above program, the two matrices are stored in 2d array, namely firstMatrix and secondMatrix. We've also defined the number of rows and columns and stored them in variables rows and columns respectively.

Then, we initialize a new array of the given rows and columns called sum. This matrix array stores the addition of the given matrices.
 */