// Example of Single Inheritance in Kotlin
open class A(var name:String){
    fun showA(){
        println("showA")
    }
}

class B:A("Kotlin"){
    fun showB(){
        println("showB")
    }
}

fun main()
{
    var cc = B()
    // calling methods from base and child classes
    cc.showA()
    cc.showB()
}