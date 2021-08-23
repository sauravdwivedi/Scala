/** Write a method that checks if there is at least one pair of
 *  numbers which sum equals target. arr=[1, 3, 4] and target=5
 *  result is true because the pair (1,4) sums to five.
 */
 
import scala.io._
import scala.collection.mutable.ArrayBuffer

object TwoSum {
  def twoSum(x: List[Int], n: Int, t: Int): Unit = {
    var p = 0
    for (i <- 0 to (n-2)) {
      for (j <- i+1 to (n-1)) {
        var y = new ArrayBuffer[Int](n)
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
    if (p != 0) {
    println(s"At least one pair sums to $t!")
    }
    else println(s"No pair sums to $t")
  }

  def main(args: Array[String]): Unit = {
    print("Array length: ")
    val n = StdIn.readInt()
    print("Enter array (space separated): ")
    val x = StdIn.readLine().split(" ").map(_.trim.toInt).toList
    print("Target: ")
    val t = scala.io.StdIn.readInt()
    twoSum(x, n, t)
  }
}
