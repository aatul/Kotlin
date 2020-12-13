class myClass {
   // property (data member)
   private var name: String = "Aatul Palandurkar"
   
   // member function
   fun printMe() {
      print("You are learning Kotlin with "+name)
   }
}

fun main() {
   val obj = myClass() // create obj object of myClass class
   obj.printMe()
}