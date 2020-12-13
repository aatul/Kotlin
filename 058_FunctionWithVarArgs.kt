fun main(){
    // The vararg modifier turns a parameter into a vararg
    fun printAll(vararg messages: String) { 
        for (m in messages) println(m)
    }
    // Calling printAll with any number of string arguments.
    printAll("Hello", "Hallo", "Salut", "Hola", "Namaskar")
    println()
    printAll("Hello", "Hallo", "Salut")
    println()

    /* 
    Thanks to named parameters, you can even add another parameter of the same type after the vararg. 
    This wouldn't be allowed in Java because there's no way to pass a value.
    */ 
    fun printAllWithPrefix(vararg messages: String, prefix: String) {  
        for (m in messages) println(prefix + m)
    }

    // Using named parameters, you can set a value to prefix separately from the vararg.
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "Namaskar",
        prefix = "Greeting: "                                          
    )

    fun log(vararg entries: String) {
        printAll(*entries)                                             
    }
    /*
    At runtime, a vararg is just an array. To pass it along into a vararg parameter, use the special spread operator * that lets you pass in *entries (a vararg of String) instead of entries (an Array<String>).
    */
}