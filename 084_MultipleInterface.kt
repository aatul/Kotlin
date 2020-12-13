interface A {
   fun showA() {
      println("I am from interface A")
   }
}

interface B  {
   fun showB() {
      println("I am from interface B")
   }
}

// implements two interfaces A and B
class multipleInterfaceExample: A, B

fun main() {
   val obj = multipleInterfaceExample()
   obj.showA()
   obj.showB()
}