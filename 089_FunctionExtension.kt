/*
    Extension Function:

    Kotlin gives the programmer the ability to add more functionality to the existing classes, by without inheriting them. This is achieved through a feature known as extensions. When a function is added to an existing class it is known as Extension Function.

    To add an extension function to a class, define a new function appended to the classname as shown in the following example:
 */

class Human {
    var skills : String = "null"
        
    fun printMySkills() {
        print(skills)
    }		
}

fun main() {
    var  a1 = Human()
    a1.skills = "JAVA"
    //a1.printMySkills()
        
    var  a2 = Human()
    a2.skills = "PYTHON"
    //a2.printMySkills()
        
    var  a3 = Human()
    a3.skills = a1.addMySkills(a2)
    a3.printMySkills()
}

// Kotlin allows to define a method outside of the main class
fun Human.addMySkills(a:Human):String{
    //this.skills = "KOTLIN"

    var a4 = Human()
    a4.skills = this.skills + " " +a.skills
    return a4.skills
}