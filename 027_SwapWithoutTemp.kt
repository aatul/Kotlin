fun main() {

    var first = 2
    var second = 4

    println("--Before swap--")
    println("First number = $first")
    println("Second number = $second")

    first = first - second      // 2-4 -> -2
    second = first + second     // -2+4 -> 2
    first = second - first      // 2-(-2) -> 4

    println("--After swap--")
    println("First number = $first")
    println("Second number = $second")
}