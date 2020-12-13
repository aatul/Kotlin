// Lambda as class extension

val lambda4 : String.(Int) -> String = { this + it } 
  
fun main() { 
    val result = "ABC".lambda4(50) 
    print(result) 
}

/*
 In the above example, we are using the lambda expression as class extension. 
 
 We have passed the parameters according to the format given above. "this" keyword is used for the string and "it" keyword is used for the Int parameter passed in the lambda. Then the code_body concatenate both the values and returns to variable result.

 In most of cases lambdas contains the single parameter. Here, "it" is used to represent the single parameter we pass to lambda expression.
 */