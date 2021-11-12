/** Each time Sunny and Johnny take a trip to the Ice Cream Parlor,
 *  they pool their money to buy ice cream. On any given day, the parlor
 *  offers a line of flavors. Each flavor has a cost associated with it.
 *  Given the value of money and the cost of each flavor for t trips to
 *  the Ice Cream Parlor, help Sunny and Johnny choose two distinct
 *  flavors such that they spend their entire pool of money during each
 *  visit. ID numbers are the 1-based index number associated with a
 *  cost. For each trip to the parlor, print the ID numbers for the two
 *  types of ice cream that Sunny and Johnny purchase as two
 *  space-separated integers on a new line. You must print the smaller
 *  ID first and the larger ID second.
 */

import scala.util._
import scala.io._

object Problem {
  def iceCream(cost: Array[Int], money: Int): String = {
    var d = (i:Int) => cost(i-1)
    var z = List[String]()
    for (i <- 1 to cost.length-1) {
      for (j <- i+1 to cost.length) {
        if (d(i) + d(j) == money) {
          z = z :+ s"$i $j"
        }
      }
    }
    z = z.sorted
    return z.mkString(" ")
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
    val inputFile = "IceCreamParlor_input.txt"
    val lines = Source.fromFile(inputFile).getLines().toList
    var x = List[Array[Int]]()
    for (line <- lines) {
      x = x :+ line.split(" ").map(_.trim.toInt)
    }
    val t = x(0)(0)
    var j = 0
    for (i <- 0 to t-1) {
      val money = x(1+j)(0)
      val n = x(2+j)(0)
      val cost = x(3+j)
      j = j + 3
      println(s"ID numbers of costs: ${Problem.iceCream(cost, money)}")
    }
  }
}
