// Return String value by lambda function

val find = fun(num: Int): String{ 
    if(num % 2==0 && num < 0) { 
    return "Number is even and negative"
    } 
    else if (num %2 ==0 && num >0){ 
    return "Number is even and positive"
    } 
    else if(num %2 !=0 && num < 0){ 
    return "Number is odd and negative"
    } 
    else { 
    return "Number is odd and positive"
    } 
} 

fun main() { 
    val result = find(22) 
    println(result) 
    println(find(-22))
} 