fun main() { 
    test("abcd") 
    println("executes after the validation") 
} 

fun test(password: String) { 
    // calculate length of the entered password and compare 
    if (password.length < 6) 
        throw ArithmeticException("Password is too short") // This will throw an exception
    else
        println("Strong password") 
} 