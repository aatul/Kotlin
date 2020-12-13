/*
    Types of Collections
    In Kotlin collections are categories into two forms.
    1. Immutable Collection
    2. Mutable Collection

    Immutable means that it supports only read-only functionalities and can not be modified its elements. Immutable Collections and their corresponding methods are:
    1. List – listOf() and listOf<T>()
    2. Set – setOf()
    3. Map – mapOf()

    Mutable Collection supports both read and write functionalities. Mutable collections and their corresponding methods are:
    1. List – mutableListOf(),arrayListOf() and ArrayList
    2. Set – mutableSetOf(), hashSetOf()
    3. Map – mutableMapOf(), hashMapOf() and HashMap
 */

fun main() { 
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3) //mutable List 
    val readOnlyView: List<Int> = numbers                  // immutable list 
    println("my mutable list--"+numbers)        // prints "[1, 2, 3]" 
    numbers.add(4) 
    println("my mutable list after addition --"+numbers)        // prints "[1, 2, 3, 4]" 
    println(readOnlyView)     
    // readOnlyView.clear()    // does not compile  
    // gives error because we try to clear immutable list of collection
}