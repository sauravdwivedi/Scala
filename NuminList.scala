/** Scala program to check if a number exists in a given list!
 */

import scala.io._

object NuminList {
  def numinList(x: List[Int], k: Int): Unit = {
    var i = 0
    var y = false
    for (i <- x) {
      if (k == i) {
        y = true
      }
    }
    if (y) print ("\t Number is in list!\n")
    else print("\t Number is NOT in list\n")
  }
  
  def main (args: Array[String]): Unit = {
    print("\t List Length: ")
    var n = scala.io.StdIn.readInt()
    print("\t Enter list (space separated): ")
    var x = StdIn.readLine().split(" ").map(_.trim.toInt).toList
    print("\t List: "+"["+x.mkString(", ")+"]"+"\n")
    print("\n\t Enter number to check if it is in list: ")
    var k = scala.io.StdIn.readInt()
    numinList(x, k)
  }
}

