/** Write a method to read two matrices from StdIn and print
 *  their product matrix.
 */

import scala.io._

object MatrixMultiplication {
  def matMult(
    matA: List[List[Int]],
    matB: List[List[Int]],
    rowsA: Int,
    colsA: Int,
    colsB: Int): List[List[Int]] = {
      var prodMat = List[List[Int]]()
      for (i <- 0 to rowsA-1) {
        var prodMatRow = List[Int]()
        for (j <- 0 to colsB-1) {
          var prodMatIJ = 0
          for (k <- 0 to colsA-1) {
            prodMatIJ += matA(i)(k) * matB(k)(j)
          }
          prodMatRow :+= prodMatIJ
        }
        prodMat :+= prodMatRow
      }
    return prodMat
  }
  
  def main(args: Array[String]): Unit = {
    println("Matrix A rows: ")
    val rowsA = StdIn.readInt()
    println("Matrix A cols: ")
    val colsA = StdIn.readInt()
    println("Space separated Matrix A entries (e.g. '1 2 3'): ")
    var matARaw: List[Int] = StdIn.readLine().trim().split(" ").map(_.trim.toInt).toList
    var matA = List[List[Int]]()
    for (i <- 0 to rowsA-1) {
      matA :+= matARaw.slice(i*colsA, i*colsA + colsA)
    }
    println("Matrix B rows: ")
    val rowsB = StdIn.readInt()
    println("Matrix B cols: ")
    val colsB = StdIn.readInt()
    println("Space separated Matrix B entries (e.g. '1 2 3'): ")
    var matBRaw: List[Int] = StdIn.readLine().trim().split(" ").map(_.trim.toInt).toList
    var matB = List[List[Int]]()
    for (i <- 0 to rowsB-1) {
      matB :+= matBRaw.slice(i*colsB, i*colsB + colsB)
    }
    if (colsA == rowsB) {
      println("The product Matrix is: ")
      var prodMat = matMult(matA, matB, rowsA, colsA, colsB)
      var result = "\n"
      for (i <- 0 to rowsA-1) {
        result += "\t" + prodMat(i).mkString(" ") + "\n"
      }
      println(result)
    } else {
      println("Matrices can't be multiplied!")
    }
  }
}
