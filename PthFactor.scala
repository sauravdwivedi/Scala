/** The program takes an integer, and provides its nth facotor. */

import scala.io.StdIn._

object PthFactor {
  def pthFactor(n: Int, p: Int): Unit = {
    var count = 0
    for (i <- 1 to (n - 1)) {
      if (n % i == 0) {
        count = count + 1
      }
    }
    var x = new Array[Int](count)
    var j = 0
    for (i <- 1 to (n - 1)) {
      if (n % i == 0) {
        x(j) = i
        j=j+1
      }
    }
    print("\t The factors: ")
    print("["+x.mkString(",")+"]")
    if (count < p) {
      print("\n\t 0")
    }
    if (p <= count) {
      print(s"\n\t ${p}th factor: ")
      print(x(p-1))
    }
  }
  
  def main(args: Array[String]): Unit = {
    print("\t Enter n: ")
    var n = scala.io.StdIn.readInt()
    print("\t Enter p: ")
    var p = scala.io.StdIn.readInt()
    pthFactor(n,p)
  }
}
