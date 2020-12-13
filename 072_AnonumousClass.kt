fun main() {
   var programmer:Human = object:Human{ // creating an instance of the interface
      override fun think() { // overriding the think method
         print("I am an example of Anonymous Inner Class ")
      }
   }
   programmer.think()
}

interface Human {
   fun think()
}