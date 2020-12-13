fun main() {
   val a: Int = 10000            // 4 Bytes  -> -2147483648 to 2147483647
   val d: Double = 100.00        // 8 Bytes
   val f: Float = 100.00f        // 4 Bytes  
   val l: Long = 1000000004      // 8 Bytes  
   val s: Short = 10             // 2 Bytes  -> -32768 to 32767
   val b: Byte = 1               // 1 Byte   -> -128 to 127
   
   println("Integer Value is "+a);
   println("Double Value is "+d);
   println("Float Value is "+f);
   println("Long Value is "+l);
   println("Short Value is "+s);
   println("Byte Value is "+b);
}