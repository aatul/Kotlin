/*
Exception handling is a very important part of a programming language. This technique restricts our application from generating the wrong output at runtime. 

There are two types of Exceptions –

1. Checked Exception – Exceptions that are typically set on methods and checked at the compile time, for example IOException, FileNotFoundException, etc.

2. UnChecked Exception – Exceptions that are generally due to logical errors and checked at the run time, for example NullPointerException, ArrayIndexOutOfBoundException etc

Kotlin Exceptions –
In Kotlin, we have only unchecked exceptions and can be caught only at run time.

The exceptions in Kotlin is pretty similar to the exceptions in Java. All the exceptions are descendants of the “Throwable” class. 

Following example shows how to use exception handling technique in Kotlin.
 */

fun main(){ 
    var num = 10 / 0      // throws exception 
    println(num) 
} 