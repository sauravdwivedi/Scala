/** Write a method that checks if there is at least one pair of
 *  numbers which sum equals target. arr=[1, 3, 4] and target=5
 *  result is true because the pair (1,4) sums to five.
 */
 
import scala.io.StdIn._
import scala.collection.mutable.ArrayBuffer

object TwoSum {
  def twoSum(n: Int, t: Int): Unit = {
    var x = new ArrayBuffer[Int](n)
    var p = 0
    for (i <- 0 to (n - 1)) {
      print("Entry: ")
      x.append(scala.io.StdIn.readInt())
    }
    for (i <- 0 to (n - 1)) {
      for (j <- 0 to (n - 1)) {
        var y = new ArrayBuffer[Int](n)
        if (j != i) {
          y.append(x(i))
          y.append(x(j))
          if (y.sum == t){
            p = p + 1
          }
          else {
            p = p + 0
          }
        }
      }
    }
    if (p != 0) {
    print(s"At least one pair sums to $t !")
    }
    else print(s"No pair sums to $t")
  }

  def main(args: Array[String]): Unit = {
    print("Array length: ")
    val n = scala.io.StdIn.readInt()
    print("Target: ")
    val t = scala.io.StdIn.readInt()
    twoSum(n, t)
  }
}
