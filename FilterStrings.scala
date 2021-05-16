/** Filter Strings: Given a list of strings, write a method that
 *  returns a list of all strings that start with the letter 'a'
 *  (lower case) and have exactly 3 letters.
 */

import scala.io.StdIn._

object FilterStrings {
  def filStr(x: Array[String]): Unit = {
    var i = 0
    var z = List[String]()
    for (i <- 0 to (x.length - 1)) {
      if (x(i).length == 3 && x(i)(0) == 'a') {
        z = z :+ x(i)
      }
    }
    print(s"List of all strings of length 3 starting with 'a': $z")
  }
  
  def main(args: Array[String]): Unit = {
    var i = 0
    print("\t Length of Array: ")
    var m = scala.io.StdIn.readInt()
    var x = new Array[String](m)
    for (i <- 0 to (m - 1)) {
      print("\t Enter the string: ")
      x(i) = scala.io.StdIn.readLine()
    }
    filStr(x)
  }
}
