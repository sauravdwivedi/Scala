/** A staircase of size (say n = 5) is combination of white spaces and #:
 *
 *      #
 *     ##
 *    ###
 *   ####
 *  #####
 *
 *  where number of #'s at bottom is equal to n. Whrite a method to print
 *  a staircase for a given integer n as input.
 */
 
import scala.io._

object StairCase {
  def stairCase(stairCaseSize: Int): String = {
    var stairCase: String = ""
    for (i <- 0 to stairCaseSize) {
      for(j <- 0 to stairCaseSize - i - 1) {
        stairCase += " "
      }
      for (k <- 0 to i - 1) {
        stairCase += "#"
      }
      stairCase += "\n"
    }
    return stairCase
  }
  
  def main(args: Array[String]): Unit = {
    print("Size of staircase: ")
    val stairCaseSize: Int = StdIn.readInt()
    val result: String = stairCase(stairCaseSize)
    println(s"The staircase of size ${stairCaseSize}!")
    println(result)
  }
}
