fun main() {

    var first = 3.5f
    var second = 4.5f

    println("--Before swap--")
    println("First number = $first")
    println("Second number = $second")

    // Value of first is assigned to temporary
    val temporary = first

    // Value of second is assigned to first
    first = second

    // Value of temporary (which contains the initial value of first) is assigned to second
    second = temporary

    println("--After swap--")
    println("First number = $first")
    println("Second number = $second")
}