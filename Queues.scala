/** A queue is an abstract data type that maintains the order in which
 *  elements were added to it, allowing the oldest elements to be removed
 *  from the front and new elements to be added to the rear. This is called a
 *  First-In-First-Out (FIFO) data structure because the first element added
 *  to the queue (i.e., the one that has been waiting the longest) is always
 *  the first one to be removed.
 *
 *  A basic queue has the following operations:
 *
 *  -> Enqueue: add a new element to the end of the queue.
 *  -> Dequeue: remove the element from the front of the queue and return it.
 *
 *  In this challenge, you must first implement a queue using two stacks. Then
 *  process q queries, where each query is one of the following 3 types:
 *
 *  Type 1) Enqueue element x into the end of the queue.
 *  Type 2) Dequeue the element at the front of the queue.
 *  Type 3) Print the element at the front of the queue.
 *
 *  Input Format: The first line contains a single integer, q, the number of
 *  queries. Each of the next q lines contains a single query in the form
 *  described in the problem statement above. All queries start with an
 *  integer denoting the query types (e.g., 1, 2, 3), but only query type '1'
 *  is followed by an additional space-separated value, x, denoting the value
 *  to be enqueued.
 */

import scala.io._

class MyQueue(val values: List[Int]) {
  /** Class to make a queue */
  def put(enqueue: Int, y: List[Int]): List[Int] = {
    /** Method to enqueue an element into queue */
    var z = y
    z = z :+ enqueue
    return z
  }
  
  def pop(y: List[Int]): List[Int] = {
    /** Method to dequeue front element from the queue */
    var z = y
    z = z.slice(1, y.length)
    return z
  }
  
  def peek(y: List[Int]): Int = {
    /** Method to print first element in the queue */
    return y(0)
  }
}
    
object Solution {
  def main(args: Array[String]): Unit = {
    print("Enter number of querries: ")
    val q = StdIn.readInt()
    var y = List[Int]()
    for (i <- 0 to q-1) {
      print("Enter queue: ")
      var values = StdIn.readLine().split(" ").map(_.trim.toInt).toList
      val queue = new MyQueue(values)
      if (values(0) == 1) {
        y = queue.put(values(1), y)
      }
      else if (values(0) == 2) {
        y = queue.pop(y)
      }
      else {
        println(queue.peek(y))
      }
    }
  }
}
