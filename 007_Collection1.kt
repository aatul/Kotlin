fun main() { 
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3) //mutable List 
    val readOnlyView: List<Int> = numbers                  // immutable list 
    println("my mutable list--"+numbers)        // prints "[1, 2, 3]" 
    numbers.add(4) 
    println("my mutable list after addition --"+numbers)        // prints "[1, 2, 3, 4]" 
    println(readOnlyView)     
    readOnlyView.clear()    // ⇒ does not compile  
    // gives error because we try to clear immutable list of collection
}