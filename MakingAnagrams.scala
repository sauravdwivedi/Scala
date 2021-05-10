/** A student is taking a cryptography class and has found anagrams
 *  to be very useful. Two strings are anagrams of each other if the
 *  first string's letters can be rearranged to form the second
 *  string. In other words, both strings must contain the same exact
 *  letters in the same exact frequency. For example, bacdc and
 *  dcbac are anagrams, but bacdc and dcbad are not.

 *  The student decides on an encryption scheme that involves two
 *  large strings. The encryption is dependent on the minimum number
 *  of character deletions required to make the two strings
 *  anagrams. Determine this number.

 *  Given two strings, a and a, that may or may not be of the same
 *  length, determine the minimum number of character deletions
 *  required to make a and b anagrams. Any characters can be deleted
 *  from either of the strings.
 */

import scala.io._

object Problem {
  def makingAnagrams(a: String, b: String): Int = {
    val n = a.length() + b.length()
    // Making local mutable copy of b, since method args are val
    var c = b
    var count = 0
    for (x <- a) {
      if (c.contains(x)) {
        count = count + 1
        c = c.replaceFirst(x.toString(), " ")
      }
    }
    n - 2 * count
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
    print("Enter string a: ")
    val a = StdIn.readLine()
    print("Enter string b: ")
    val b = StdIn.readLine()
    print(Problem.makingAnagrams(a, b))
  }
}
