/** Fibonacci Number: Write a method that returns the nth element of
 *  the Fibonacci Sequence. The Fibonacci Sequence is the series of
 *  numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,... The next number is
 *  found by adding up the two numbers before it. Assume that
 *  indexes start at zero, e.g., fib(0) = 0, fib(1) = 1, ...
 */
 
import scala.io.StdIn._

object Fibonacci {
  def fibSeq(n: Int): Unit = {
    var x = new Array[Int](n)
    var i = 0
    x(0) = 0
    x(1) = 1
    for (i <- 2 to (n - 1)) {
      x(i) = x(i - 1) + x(i - 2)
    }
    println(x.mkString(" "))
  }
  
  def main(args: Array[String]): Unit = {
    print("\t Enter number: ")
    var m = scala.io.StdIn.readInt()
    fibSeq(m)
  }
}
