fun main() {
   val Human = Human("Aatul", 35)
   print("${Human.message}"+"${Human.firstName}!"+
      "\nWelcome to Kotlin Training, Your Age is ${Human.age}")
}

class Human(val firstName: String, var age: Int) {
   val message:String  = "Hey "
	constructor(name : String, age : Int, message : String):this(name,age) {
   }
}