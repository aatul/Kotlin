// Example of Multilevel Inheritance in Kotlin
open class A(var name:String){
    fun showA(){
        println(name)
        println("showA")
    }
}

open class B:A("Kotlin"){
    fun showB(){
        println("showB")
    }
}

class C:B(){
    fun showC(){
        println("showC")
    }
}

fun main()
{
    var cc = C()
    // calling methods from base and child classes
    cc.showA()
    cc.showB()
    cc.showC()
}