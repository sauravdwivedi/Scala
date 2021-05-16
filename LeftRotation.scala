/** A left rotation operation on an array shifts each of the array's
 *  elements 1 unit to the left. For example, if 2 left rotations are
 *  performed on array [1,2,3,4,5], then the array would become
 *  [3,4,5,1,2]. Note that the lowest index item moves to the highest
 *  index in a rotation. This is called a circular array.
 *
 *  Given an array a of n integers and a number, d, perform d left
 *  rotations on the array. Return the updated array to be printed
 *  as a single line of space-separated integers.
 */

import scala.io.StdIn._

object LeftRotation {
  def oneLeftRot(a: List[Int]): List[Int] = {
    var x = List[Int]()
    for (j <- 0 to (a.length-1)) {
      if (j < a.length-1) {
        x = x :+ a(j+1)
      }
      else {
        x = x :+ a(0)
      }
    }
  return x
  }

  def main (args: Array[String]): Unit = {
    print("Length of array: ")
    val n = scala.io.StdIn.readInt()
    var a = List[Int]()
    for (i <- 0 to (n-1)){
      print("entry: ")
      a = a :+ scala.io.StdIn.readInt()
    }
    print("Enter no. of rotations: ")
    val d = scala.io.StdIn.readInt()
    var c = 0
    while (c < d) {
      var z = oneLeftRot(a)
      c = c + 1
      a = z
    }
    print(s"Array after $d rotations: [${a.mkString(",")}]")
  }
}
