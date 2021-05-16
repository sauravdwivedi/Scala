/** Comma Separated: Write a method that returns a comma-separated
 *  string based on a given list of integers. Each element should be
 *  preceded by the letter 'e' if the number is even, and preceded
 *  by the letter 'o' if the number is odd. For example, if the
 *  input list is (3,44), the output should be 'o3,e44'.
 */

import scala.io.StdIn._

object CommaSep {
  def comSep(x: Array[Int]): Unit = {
    var i = 0
    var y = ""
    for (i <- 0 to (x.length - 1)){
      if (x(i) % 2 == 0){
        y = y + "e" + x(i).toString + ","
      }
      else{
        y = y + "o" + x(i).toString + ","
      }
    }
    print(y)
  }
  
  def main(args: Array[String]): Unit = {
    var i = 0
    print("Enter length of List: ")
    var x = new Array[Int](scala.io.StdIn.readInt())
    for (i <- 0 to (x.length - 1)) {
      print("Enter number: ")
      x(i) = scala.io.StdIn.readInt()
    }
    comSep(x)
  }
}
