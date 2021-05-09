/** Prime Number: A prime number is a natural number greater than 1
 *  that has no positive divisors other than 1 and itself. Write a
 *  method that checks if a number is a prime number.
 */

import scala.io.StdIn._

object PrimeNumber {
  def numPrime(n: Int): Unit = {
    var i = 0
    var x: Boolean = true
    var y: Boolean = true
    for (i <- 2 to (n - 1)) {
      if (n % i == 0) x = false
    }
    if (n % 2 == 0) y = true
    else y = false
    if (x == true) print("\t Number is Prime!")
    if (x == false && y == false) print("\t Number is Odd!")
    if (y == true) print("\t Number is Even!")
  }
  
  def main(args: Array[String]): Unit = {
    print("\t Enter number: ")
    var m = scala.io.StdIn.readInt()
    numPrime(m)
  }
}

