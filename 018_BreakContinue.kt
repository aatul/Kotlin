fun main() {
   
   for(x in 1..10) { // appling the custom label
      if(x == 5) {
         println("I am inside if block with value "+x+"\n hence it will close the operation")
         break //specifing the label
      } else {
         println("I am inside else block with value"+x)
         continue
      }
   }
}