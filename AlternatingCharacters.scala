/** You are given a string containing characters A and B only. Your
 *  task is to change it into a string such that there are no
 *  matching adjacent characters. To do this, you are allowed to
 *  delete zero or more characters in the string.
 *
 *  Your task is to find the minimum number of required deletions.
 *
 *  Example:
 *  s = AABAAB
 *
 *  Remove an A at positions 0 and 3 to make s = ABAB in 2
 *  deletions.
 */
 
 import scala.io._

object Problem {
  def altChar(s: String): Int = {
    /** Method to find min no. of deletions */
    var x = s(0).toString
    for (i <- 0 to s.length()-2) {
      if (s(i+1) != s(i)) {
        x = x + s(i+1).toString
      }
    }
    val deletions = s.length() - x.length()
    return deletions
  }
}


object Solution {
  def main(args: Array[String]): Unit = {
    print("Enter string: ")
    val s = StdIn.readLine()
    print(Problem.altChar(s))
  }
}
