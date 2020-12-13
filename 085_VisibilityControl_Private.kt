/*
The classes, methods, and packages can be declared with a private modifier. Once anything is declared as private, then it will be accessible within its immediate scope.

For instance, a private package can be accessible within that specific file. A private class or interface can be accessible only by its data members, etc.

In the below example, the class “privateExample” and the variable i both can be accessible only in the same Kotlin file, where its mentioned as they all are declared as private in the declaration block.
 */

private class privateExample {
   private val i = 1
   private val doSomething() {
   }
}

