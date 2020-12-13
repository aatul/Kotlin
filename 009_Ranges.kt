fun main() {
   val i:Int  = 2
   for (j in 1..4) // equivalent to for(i=1; i<=4; i++) - range(5)
   println(j) // prints "1234"
   
   println() // prints blank line
   if (i in 1..10) { // equivalent of i>=1 && i < = 10
      println("we found your number: "+i)
   }
}