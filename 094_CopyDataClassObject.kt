/*
    copy()
    Sometimes we need to copy an object, with some change in some of its properties keeping all others unchanged.
    In this case copy() function is used.

    Properties of copy():
    1. It copies all arguments or members defined in primary constructor
    2. Two objects can have same primary parameter values and different class body values if defined
 */

fun main()  
{ 
    //declaring a data class  
    data class man(val name: String, val age: Int) 
    { 
        //property declared in class body 
        var height: Int = 0; 
    } 
       
    val man1 = man("ABC",18) 
   
    //copying details of man1 with change in name of man 
    val man2 = man1.copy(name="XYZ") 
   
    //copying all details of man1 to man3 
    val man3 = man1.copy(); 
   
    //declaring heights of individual men 
    man1.height=170
    man2.height=160
    man3.height=190
   
    //man1 & man3 have different class body values, 
    //but same parameter values 
   
    //printing info all 3 men 
    println("${man1} has ${man1.height} cm height") 
    println("${man2} has ${man2.height} cm height") 
    println("${man3} has ${man3.height} cm height") 
   
} 