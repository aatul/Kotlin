inline fun higherfunc( str : String, mycall :(String)-> Unit){ 
    //inovkes the print() by passing the string str 
    mycall(str) 
} 
    // main function 
 fun main() { 
    print("From Main(): ") 
    higherfunc("Calling Higher Function",::print) 
} 
/*
 In Kotlin, the higher order functions or lambda expressions, all stored as an object so memory allocation, for both function objects and classes, and virtual calls might introduce runtime overhead. Sometimes we can eliminate the memory overhead by inlining the lambda expression.

In order to reduce the memory overhead of such higher order functions or lambda expression we can use the inline keyword which ultimately requests the compiler to not allocate memory and simply copy the inlined code of that function at the calling place.

With the help of inline keyowrd the println lambda expression is copied in the main function in the form of System.out.println and no further calls required.
 */