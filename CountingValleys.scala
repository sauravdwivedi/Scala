/** An avid hiker keeps meticulous records of their hikes. During
 *  the last hike that took exactly n steps, for every step it was
 *  noted if it was an uphill, U, or a downhill, D step. Hikes
 *  always start and end at sea level, and each step up or down
 *  represents a 1 unit change in altitude. We define the following
 *  terms:
 *
 *  - A mountain is a sequence of consecutive steps above sea level,
 *  starting with a step up from sea level and ending with a step
 *  down to sea level.
 *  - A valley is a sequence of consecutive steps below sea level,
 *  starting with a step down from sea level and ending with a step
 *  up to sea level.
 *  - Given the sequence of up and down steps during a hike, find
 *  and print the number of valleys walked through.
 *
 *  Example:
 *
 *  steps = 8, path = [DDUUUUDD]
 *
 *  The hiker first enters a valley 2 units deep. Then they climb out
 *  and up onto a mountain 2 units high. Finally, the hiker returns
 *  to sea level and ends the hike.
 */

import scala.io._

object Problem {
  def countValley(path: String): Int = {
    /** Method to calculate number of valleys */
    var count = 0
    var j = 0
    var list_valleys = List[String]()
    for (i <- 0 to path.length-1) {
      if (path(i) == 'U') {
        count = count + 1
      }
      if (path(i) == 'D') {
        count = count - 1
      }
      if (count == 0 && path(i) == 'U') {
        list_valleys = list_valleys :+ path.slice(j,i+1)
        j = i
      }
    }
    return list_valleys.length
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
    print("Sequence of consecutive steps: ")
    val path = StdIn.readLine()
    print(Problem.countValley(path))
  }
}
