fun main()  
{ 
    //declaring a data class  
    data class man(val roll: Int,val name: String,val height:Int) 
   
    //declaring a variable of the above data class  
    //and initializing values to all parameters 
   
    val man1=man(1,"man",50) 
       
    //printing all the details of the data class 
    println(man1.toString()); 
} 