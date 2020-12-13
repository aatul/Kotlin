fun main() {
    try {
        val myVar:Int = 12
        val v:String = "Kotlin Training"
        v.toInt()   // Will throw an exception
    } catch(e:Exception) {
        e.printStackTrace()
    } finally {
        println("Finally block executes always")
    }
}