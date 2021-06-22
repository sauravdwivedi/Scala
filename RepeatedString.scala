/** There is a string, s, of lowercase English letters that is repeated
 *  infinitely many times. Given an integer, n, find and print the number of
 *  letter a's in the first n letters of the infinite string.
 *
 *  Example:
 *
 *  s = 'abcac'
 *  n = 10
 *
 *  The substring we consider is abcacabcac, the first 10 characters of the
 *  infinite string. There are 4 occurrences of a in the substring.
 */

import scala.io._

object Problem {
  def repeatedString(s: String, n: Int): Int = {
    /** Method to count occurences of 'a' in first n characters */
    var remainder = n % s.length
    var ratio = (n / s.length).toInt
    var result = s.slice(0,remainder).count(_ == 'a') +
      ratio * s.count(_ == 'a')
    return result
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
  println("Enter string: ")
  var s = StdIn.readLine()
  println("Enter integer: ")
  var n = StdIn.readInt()
  var result = Problem.repeatedString(s, n)
  println(s"The number of occurences of 'a' in first $n characters: ${result}")
  }
}
