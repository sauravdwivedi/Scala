/** Given an array of integers and a target value, determine the number of pairs
 *  of array elements that have a difference equal to the target value.
 *
 *  Example:
 *  k = 1
 *  arr = [1,2,3,4]
 *
 *  There are three values that differ by k=1: 2-1=1, 3-2=1, and 4-3=1. Return 3.
 */
 
import scala.io._

object Problem {
  def pairs(k:Int, arr: List[Int]): Int = {
    /**Method to find number of pairs that have diff equal to target*/
    val arrSet = arr.toSet
    var count = 0
    for (x <- arrSet) {
      if (arrSet.contains(x+k)) {
        count = count + 1
      }
    }
    return count
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
    println("Enter target value: ")
    val k = StdIn.readInt()
    println("Enter array of integers: ")
    val arr = StdIn.readLine().split(" ").map(_.trim.toInt).toList
    val result = Problem.pairs(k, arr)
    println(s"Number of pairs with difference ${k} are ${result}")
  }
}
