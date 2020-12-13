/*
 Syntax:
 fun fun_name(a: data_type, b: data_type, ......): return_type  {
    // some code
    return  // if return type mentioned, otherwise optional
}
 */

fun demoFunction(message: String): Unit {                               
    println(message)
}

fun main() {
    demoFunction("Hello")
}