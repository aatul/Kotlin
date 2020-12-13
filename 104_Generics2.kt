/*
In below example, we create an GenericsExample class with primary constructor having single parameter. 

Now, we try to pass the different type of data in object of GenericsExample class as String and Integer. 

The primary constructor of GenericsExample class accept string type (“Kotlin”) but gives compile time error when passes Integer type (12).
 */

class GenericsExample (text: String) { 
    var x = text 
    init{ 
        println(x) 
    } 
} 

fun main(){ 
    var name: GenericsExample = GenericsExample("Kotlin") 
    var rank: GenericsExample = GenericsExample(9)// compile time error 
} 