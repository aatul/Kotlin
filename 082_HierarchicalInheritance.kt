// Example of Hierarchical Inheritance in Kotlin
open class A(var name:String){
    fun showA(){
        println("I am "+name)
        println("showA")
    }
}

open class B:A("From B"){
    fun showB(){
        println("showB")
    }
}

class C:A("From C"){
    fun showC(){
        println("showC")
    }
}

fun main()
{
    var cc = C()
    // calling methods from base and child classes
    cc.showA()
    cc.showC()

    var b = B()
    b.showA()
    b.showB()
}