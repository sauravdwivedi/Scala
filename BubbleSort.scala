/** Consider the following version of Bubble Sort:
 *  for (int i = 0; i < n; i++) {
 *    for (int j = 0; j < n - 1; j++) {
 *      // Swap adjacent elements if they are in decreasing order
 *      if (a[j] > a[j + 1]) {
 *          swap(a[j], a[j + 1]);
 *      }
 *    }
 *  }
 *  Given an array of integers, sort the array in ascending order using
 *  the Bubble Sort algorithm above. Once sorted, print the following
 *  three lines:
 *
 *  Array is sorted in numSwaps swaps., where numSwaps is the number of
 *  swaps that took place.
 *
 *  First Element: firstElement, where firstElement is the first element
 *  in the sorted array.
 *
 *  Last Element: lastElement, where lastElement is the last element in
 *  the sorted array.
 *
 *  Hint: To complete this challenge, you must add a variable that keeps
 *  a running tally of all swaps that occur during execution.
 */
 
import scala.io._
 
object BubbleSort {
  def bubbleSort(arrayInt: Array[Int]): Unit = {
  /** Method to count number of swaps to sort the array */
    var numSwaps = 0
    for (i <- 0 to arrayInt.length - 1) {
      for (j <- 0 to arrayInt.length - 2) {
        if (arrayInt(j) > arrayInt(j+1)) {
          val left = arrayInt(j)
          arrayInt(j) = arrayInt(j+1) 
          arrayInt(j+1) = left
          numSwaps += 1
        }
      }
    }
    println(s"Sorted array: [${arrayInt.mkString(", ")}]")
    println(s"Array is sorted in $numSwaps swaps.")
    println(s"First element: ${arrayInt(0)}")
    println(s"Last element: ${arrayInt(arrayInt.length-1)}")
  }
  
  def main(args: Array[String]): Unit = {
    println("Enter array of integers (space separated e.g. '1 2 3'): ")
    val arrayInt = StdIn.readLine().split(" ").map(_.trim.toInt).toArray
    println(s"Given array: [${arrayInt.mkString(", ")}]")
    bubbleSort(arrayInt)
  }
}

