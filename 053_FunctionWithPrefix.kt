fun demo(message: String, prefix: String = "Default Prefix") {  // 2
    println("[$prefix] $message")
}

fun main() {              
    demo("Hello", "Prefix 1")                       // passing prefix       
    // Calls the same function using named arguments and changing the order of the arguments.
    demo(prefix = "Prefix 2", message = "Hello")    // passing prefix, named arguments
    demo("Hello")                                   // without prefix, will use Default Prefix
}