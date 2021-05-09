/** Scala program to check if a given number is even or odd!
 */

import scala.io.StdIn.readInt

object Even {
  def funEven(n: Int): Unit = {
    var x = true
    if (n % 2 == 0) {
      x = true
    }
    else {
    x = false
    }
    if (x) print("Number is Even!")
    else print("Number is Odd!")
  }
  
  def main(args: Array[String]) {
    print("Enter Number: ")
    var m = scala.io.StdIn.readInt()
    funEven(m)
  }
}
