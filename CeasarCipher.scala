/** The Ceasar cipher is a basic encryption technique used by Julius
 *  Ceasar to securely communicate with his generals. Each letter is
 *  replaced by another letter N positions down the english
 *  alphabet. For example, for a rotation of 5, the letter 'c' would
 *  be replaced by an 'h'. In case of a 'z', the alphabet rotates
 *  and it is transformed into a 'd'. Implement a decoder for the
 *  Ceasar cipher where N = 5.
 */

import scala.io.StdIn._

object CeasarCipher {
  def ceasCiph(n: Int): Unit = {
    var x = "abcdefghijklmnopqrstuvwxyz"
    print("Enter decoded message: ")
    var y = scala.io.StdIn.readLine()
    var i = 0
    var j = 0
    var z = ""
    for (i <- 0 to (x.length - 1)){
      for (j <- 0 to (y.length - 1)){
        if (y(j) == x(i)){
          if (i < n){
            z = z + x(x.length + i - n)
          }
          else {z = z + x(i - n)
          }
        }
      }
    }
    print("Decoded message: ")
    print(z)
  }
  
  def main(args: Array[String]): Unit = {
    print("Enter rotation number: ")
    val n = scala.io.StdIn.readInt()
    ceasCiph(n)
  }
}
