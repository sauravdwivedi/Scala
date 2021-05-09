/** Scala program to check if a number exists in a given list!
 */

import scala.io.StdIn._

object NuminList {
  def numinList(): Unit = {
    var i = 0
    var y = false
    print("\t List Length: ")
    var n = scala.io.StdIn.readInt()
    var x = new Array[Int](n)
    for (i <- 0 to (n - 1)) {
      print("\t List entry: ")
      x(i) = scala.io.StdIn.readInt()
    }
    print("\t List: "+"["+x.mkString(" , ")+"]"+"\n")
    print("\n\t Enter number to check if it is in list: ")
    var k = scala.io.StdIn.readInt()
    for (i <- 0 to (n - 1)) {
      if (k == x(i)) {
        y = true
      }
    }
    if (y)print ("\t Number is in list!\n")
    else print("\t Number is NOT in list\n")
  }
  
  def main (args: Array[String]): Unit = {
    numinList()
  }
}

