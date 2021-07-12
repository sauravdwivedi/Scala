/** Given a table of shoe sizes and names of people with these sizes:
 *
 *  42 42 43 45 42
 *  Saurav Joe Albert Pepe Saurav
 *
 *  Write a script that:
 *
 *  1. Returns modal shoe size
 *  2. In case there is no unique modal size, return "-1"
 *  3. Returns name of modal names associated to modal size
 *  4. In case of no modal size, return ""."""
 */
 
import scala.util._
import scala.io._

object Problem {
  def shoeSize(sizes: Array[Int], names: Array[String]): String = {
    /** Method to find out modal size and modal name for modal size */
    var modeOfsz = sizes.groupBy(i => i).view.mapValues(_.size).maxBy(_._2)._1
    var indexOfModes = List[Int]()
    for (i <- 0 to sizes.length-1) {
      if (sizes(i) == modeOfsz) {
        indexOfModes = indexOfModes :+ i
      }
    }
    var modalNames = List[String]()
    for (i <- 0 to indexOfModes.length-1) {
      modalNames = modalNames :+ names(indexOfModes(i))
    }
    var modeModalNames = modalNames.groupBy(i => i).view.mapValues(_.size).maxBy(_._2)._1
    var indexOfModalname = List[Int]()
    for (i <- 0 to modalNames.length-1) {
      if (modalNames(i) == modeModalNames) {
        indexOfModalname = indexOfModalname :+ i
      }
    }
    var x = 0
    var y = ""
    if (indexOfModes.length > 1) {
      x = modeOfsz
    }
    else {
      x = -1
      }
    if (indexOfModalname.length > 1) {
      y = modeModalNames
    }
    else {
      y = ""
    }
    var result = s"Modal shoe size is $x and modal name for this size is '$y'"
    return result
  }
}
    
object Solution {
  def main(args: Array[String]): Unit = {
    val inputFile = "ShoeSizes_input.txt"
    val lines = Source.fromFile(inputFile).getLines().toList
    val sizes = lines(0).split(" ").map(_.trim.toInt)
    val names = lines(1).split(" ")
    val result = Problem.shoeSize(sizes, names)
    println(result)
  }
}
