fun main(){ 
    try{ 
        var ar = arrayOf(1,2,3,4,5) 
        var int = ar[6] 
        println(int) 
    } 
    finally { 
        println("This block always executes") 
    } 
} 