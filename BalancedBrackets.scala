/** A bracket is considered to be any one of the following
 *  characters: (, ), {, }, [, or ].
 *
 *  Two brackets are considered to be a matched pair if the an
 *  opening bracket (i.e., (, [, or {) occurs to the left of a
 *  closing bracket (i.e., ), ], or }) of the exact same type. There
 *  are three types of matched pairs of brackets: [], {}, and ().
 *
 *  A matching pair of brackets is not balanced if the set of
 *  brackets it encloses are not matched. For example, {[(])} is not
 *  balanced because the contents in between { and } are not
 *  balanced. The pair of square brackets encloses a single,
 *  unbalanced opening bracket, (, and the pair of parentheses
 *  encloses a single, unbalanced closing square bracket, ].
 *
 *  By this logic, we say a sequence of brackets is balanced if the
 *  following conditions are met:
 *
 *  1) It contains no unmatched brackets.
 *  2) The subset of brackets enclosed within the confines of a
 *  matched pair of brackets is also a matched pair of brackets.
 *
 *  Given n strings of brackets, determine whether each sequence of
 *  brackets is balanced. If a string is balanced, return YES.
 *  Otherwise, return NO.
 */
 
import scala.io._
import scala.util.control.Breaks._

object Problem {
  def isBalanced(s: String): String = {
    /** Method to identify if a string of brackets is balanced */
    // list of indeces of balanced subbrackets in string
    var listOfbsb = List[Int]()
    for (i <- 0 to s.length-1) {
      if (
        (s(i) == '(' && s(i+1) == ')')
        || (s(i) == '[' && s(i+1) == ']')
        || (s(i) == '{' && s(i+1) == '}')) {
        listOfbsb = listOfbsb :+ i
        }
      }
    var t = s
    var y = 0
    for (x <- listOfbsb) {
      t = t.slice(0,x-y) + t.slice(x+2-y,s.length)
      y = y + 2
      }
    
    breakable {
      while (t.length >= 1) {
        if ((t(0) == '(' && t(t.length-1) == ')')
          || (t(0) == '[' && t(t.length-1) == ']')
          || (t(0) == '{' && t(t.length-1) == '}')) {
          t = t.slice(1, t.length-1)
          }
        else
          break
      }
    }
    
    var result = ""
    if (t.length == 0) {
        result = "YES"
        }
    else {
        result = "NO"
        }
    return result
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
    print("No. of Strings: ")
    val n = StdIn.readInt()
    for (i <- 0 to n-1) {
      print("String of brackets: ")
      val s = StdIn.readLine()
      print(Problem.isBalanced(s))
      }
  }
}
