fun main() {

  infix fun Int.times(str: String) = str.repeat(this)        
  println(2 times "Bye ")                                    

  // Standard library
  val pair = "Java" to "James Gosling"                          
  println(pair)

  // Custom Pair implementation
  infix fun String.onto(other: String) = Pair(this, other)   
  val myPair = "Python" onto "Guido Van Rossum"
  println(myPair)

  val abc = Person("ABC")
  val xyz = Person("XYZ")
  abc likes xyz                                       
}

class Person(val name: String) {
  val likedPeople = mutableListOf<Person>()
  infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}

/*
1. Defines an infix extension function on Int.
2. Calls the infix function.
3. Creates a Pair by calling the infix function "to" from the standard library.
4. Own/cunstom implementation of "to" creatively called "onto".
5. Infix notation also works on members functions (methods).
6. The containing class becomes the first parameter.
 */