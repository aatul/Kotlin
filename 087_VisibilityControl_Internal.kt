/*
Internal is a newly added modifier introduced in Kotlin. 

If anything is marked as internal, then that specific field will be in the internal field. An Internal package is visible only inside the module under which it is implemented. 

An internal class interface is visible only by other class present inside the same package or the module. 

In the following example, we will see how to implement an internal method.
 */

package abc.xyz

class internalExample {
   internal val i = 1
   internal fun doSomething() {
   }
}