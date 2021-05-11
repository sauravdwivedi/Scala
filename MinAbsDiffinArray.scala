/** The absolute difference is the positive difference between two
 *  values a and b, is written |a-b| or |b-a| and they are equal. If
 *  a = 3 and b = 2, |3-2| = |2-3| = 1. Given an array of integers,
 *  find the minimum absolute difference between any two elements in
 *  the array."""
 */

import scala.io._
import scala.collection.mutable.ArrayBuffer

object Problem {
  def minAbsDiff(a: Array[Int]): Int = {
    /** Method to find minimum absolute difference */
    var absDiff = new ArrayBuffer[Int]
    for (i <- 0 to a.length - 2) {
      for (j <- i+1 to a.length - 1) {
        absDiff.append((a(i)-a(j)).abs)
      }
    }
    return absDiff.reduceLeft(_ min _)
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
    print("Enter array (space separated): ")
    val a = StdIn.readLine().split(" ").map(_.toInt)
    print(s"Minimum absolute difference btw two values: ${Problem.minAbsDiff(a)}")
  }
}
