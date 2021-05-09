/** Package Rice Bags: Provided that you have a given number of
 *  small rice bags (1 kilo each) and big rice bags (5 kilos each),
 *  write a method that returns true if it is possible to make a
 *  package with goal kilos of rice.
 */

import scala.io.StdIn._

object RiceBags {
  def riceBags(m: Int,n: Int,p: Int): Unit = {
    var i = 0
    var j = 0
    var x = false
    for (i <- 0 to p) {
      for (j <- 0 to p) {
        if (p == i * m + j * n) {
          x = true
        }
      }
    }
    if (x) print(
      "\t It is possible to make target goal from small bags!")
    else print(
      "\t It is NOT possible to make target goal from small bags!")
  }
  
  def main(args: Array[String]): Unit = {
    print("\t Enter first bag size (in Kilo): ")
    var m = scala.io.StdIn.readInt()
    print("\t Enter second bag size (in Kilo): ")
    var n = scala.io.StdIn.readInt()
    print("\t Enter target bag size (in Kilo): ")
    var p = scala.io.StdIn.readInt()
    riceBags(m,n,p)
  }
}
