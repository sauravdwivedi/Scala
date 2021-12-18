/** Python script to print "Fizz" if a number is divisible by 3, print 
 *  "Buzz" if a number is divisible by 5, and print "FizzBuzz" if a number 
 *  is divisible by both 3 and 5 for numbers in a given range
 */
 
 import scala.io._
 
 object FizzBuzz {
   def fizzBuzz(targetNum: Int): Unit = {
     for (x <- 1 to targetNum) {
       if ((x % 3 == 0) && (x % 5 == 0)) {
         println("FizzBuzz")
       } 
       else if (x % 3 == 0) {
         println("Fizz")
       }
       else if (x % 5 == 0) {
         println("Buzz")
       }
       else {
         println(x)
       }
     }
   }
   
   def main(args: Array[String]): Unit = {
     println("Enter range of numbers: ")
     val targetNum = StdIn.readInt()
     fizzBuzz(targetNum)
   }
 }
