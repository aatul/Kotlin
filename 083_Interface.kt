// Define Interface
interface ExampleInterface  {
   var myVar: Int            // abstract property
   fun absMethod():String    // abstract method
   
   fun normalMethod() {
      println("Hello there, Hope you are having fun with Kotlin.")
   }
}

// Implement Interface to class
class InterfaceImp : ExampleInterface {
   override var myVar: Int = 25
   override fun absMethod() = "Happy Learning"
}

fun main() {
   val obj = InterfaceImp()
   println("My Variable Value is = ${obj.myVar}")
   print("Calling normalMethod(): ")
   obj.normalMethod()
   print("Calling abstract method: ")
   println(obj.absMethod())
}