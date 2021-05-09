/** Greatest Common Divisor: The Greatest Common Divisor of two
 *  positive integers is the largest integer that divides both
 *  without remainder. Write a method that returns the Greatest
 *  Common Divisor of p and q.
 */

import scala.io.StdIn._

object GCDivisor {
  def gcDivisor(n:Int, m:Int): Unit = {
    var i = 0
    var j = 0
    var z = 0
    var x = new Array[Int](m + n)
    if (m > n) {
      for (i <- 1 to m){
        if (n % i == 0 && m % i == 0) {
          x(j)=i
          j=j+1
        }
      }
    }
    else {
      for (i <- 1 to n) {
        if (n % i == 0 && m % i == 0) {
          x(j)=i
          j=j+1
        }
      }
    }
    for (i <- 0 to (m + n - 1)) {
      if (x(i) > z) {
        z = x(i)
      }
    }
    print("\t Greatest common divisor: "+z+"\n")
  }
  
  def main(args: Array[String]): Unit = {
    print("\t Enter first number: ")
    var n = scala.io.StdIn.readInt()
    print("\t Enter second number: ")
    var m = scala.io.StdIn.readInt()
    gcDivisor(n,m)
  }
}
