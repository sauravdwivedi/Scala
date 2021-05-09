/** Filter Strings: Given a list of strings, write a method that
 *  returns a list of all strings that start with the letter 'a'
 *  (lower case) and have exactly 3 letters. TIP: Use Java 8 Lambdas
 *  and Streams API's.
 */

import scala.io.StdIn._

object FilterStrings {
  def filStr(x: Array[String]): Unit = {
    var i = 0
    var j = 0
    print("["+x.mkString(",")+"]")
    print("\t Length of String: ")
    var n = scala.io.StdIn.readInt()
    var z = new Array[String](n)
    for (i <- 0 to (n - 1)) {
      if (x(i).length == 3 && x(i)(0) == 'a') {
        z(i) = x(i)
      }
      else z(i) = ""
    }
    val y = z.filter(_.nonEmpty)
    print("["+y.mkString(",")+"]")
  }
  
  def main(args: Array[String]): Unit = {
    var i = 0
    print("\t Length of String: ")
    var m = scala.io.StdIn.readInt()
    var x = new Array[String](m)
    for (i <- 0 to (m - 1)) {
      print("\t Enter the string: ")
      x(i) = scala.io.StdIn.readLine()
    }
    filStr(x)
  }
}
