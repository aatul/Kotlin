// Print with index numbers
fun main() {
   val items = listOf(1,2,3,4)
   
   for ((index, value) in items.withIndex()) {
      println("The element at $index is $value")
   }
}