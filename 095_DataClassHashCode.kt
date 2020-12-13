/*
    hashCode() and equals():

    1. hashCode() function returns a hash code value for the object.
    2. equals() method return true if two objects have same contents and it works similar to “==”, but works different for Float and Double values.

    Properties of hashCode():
    1. Two hash codes declared two times on same object will be equal.
    2. If two objects are equal according to equals() method, then the hash codes returned will also be same
 */

fun main()  
{ 
    //declaring a data class  
    data class man(val name: String, val age: Int) 
       
    val man1 = man("ABC",18) 
    val man2 = man1.copy(name="XYZ") 
    val man3 = man1.copy(); 
   
    val hash1=man1.hashCode(); 
    val hash2=man2.hashCode(); 
    val hash3=man3.hashCode(); 
   
    println(hash1) 
    println(hash2) 
    println(hash3) 
   
    //checking equality of  these hash codes 
    println("hash1 == hash 2 ${hash1.equals(hash2)}") 
    println("hash2 == hash 3 ${hash2.equals(hash3)}") 
    println("hash1 == hash 3 ${hash1.equals(hash3)}") 
}