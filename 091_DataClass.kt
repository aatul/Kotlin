/*
    Data Class
    1. A class can be marked as a Data class whenever it is marked as ”data”. 
    This type of class can be used to hold the basic data apart. 
    Other than this, it does not provide any other functionality.

    2. All the data classes need to have one primary constructor and all the primary constructor should have at least one parameter. Whenever a class is marked as data, we can use some of the inbuilt function of that data class such as “toString()”,"hashCode()”, etc. 

    3. Any data class cannot have a modifier like abstract and open or internal. Data class can be extended to other classes too. In the following example, we will create one data class.

    Rules to create Data classes –
    1. The primary constructor needs to have at least one parameter.
    2. All primary constructor parameters need to be marked as val or var.
    3. Data classes cannot be abstract, open, sealed or inner.
    4. Data classes may only implement interfaces.
 */
 
fun main() {
   val book: Book = Book("Kotlin for Android", "Aatul Palandurkar", 7)
   println("Book Name: "+book.name) // "Kotlin"
   println("Author: "+book.author) // "Aatul Palandurkar"
   println("Review: "+book.reviewScore) // 7
   book.reviewScore = 9 // change/replace the value
   println("Printing all info: "+book.toString()) 
   //using inbuilt function of the data class 
   
   println("Example of the hashCode function: "+book.hashCode())
}

data class Book(val name: String, val author: String, var reviewScore: Int)