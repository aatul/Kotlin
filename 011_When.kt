fun main() {
   val x:Int = 2
   // equivalent to switch statement in Java
   when (x) {
      1 -> print("x : 1")
      2 -> print("x : 2")
      
      // equivalent to default statement in switch case
      else -> { // Note the block
         print("x is neither 1 nor 2")
      }
   }
}