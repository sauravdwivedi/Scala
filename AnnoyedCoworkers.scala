/**It’s another day in the office, and you’re a mastermind of not doing 
 * any work yourself. Instead, you’ll go to your coworkers for “help,” 
 * but secretly have them do all the work.
 * 
 * You’ve determined that the more one of your coworkers helps you, the 
 * more annoyed they become. You’ve also been able to determine how much 
 * more annoyed a coworker gets everytime you ask them for help. At the 
 * beginning of the day, a coworker is initially a annoyed at you. That’s 
 * their annoyance level. Everytime you ask them for help though, they 
 * become d more annoyed at you – their annoyance level a increases 
 * by a constant amount d so that a += d.
 * 
 * You want to complete a project of h tasks solely with “help” from your 
 * coworkers, but you need to be careful not to annoy any of them too much.
 * 
 * What’s the best you can do?
 * 
 * The first line contains 2 integers h and c, where h is the number of 
 * times you have to ask for help to complete the project, and c denotes 
 * the number of coworkers you have. Each of the following c lines contains 
 * two positive integers a and d, representing a coworker whose initial 
 * annoyance level is a and who is getting more annoyed at you by an 
 * increase of d every time you ask them for help.
 * 
 * Output a single number, which is the maximum annoyance level any coworker 
 * has at you provided you use an optimal strategy to minimize this level.

Run: 

scalac AnnoyedCoworkers.scala

echo "4 4           
1 2
2 3
3 4
4 5" | scala AnnoyedCoworkers

 */

import scala.io._

object AnnoyedCoworkers {
  def annoyanceLevel (
    coworkers: List[List[Int]], 
    numOfTasks: Int, 
    numOfCoworkers: Int
    ): Int = {
    var annoyance = List[Int]()
    var annoyanceLevels = List[Int]()
    for (worker <- coworkers) {
      annoyance = annoyance :+ worker(0) + worker(1)
      annoyanceLevels = annoyanceLevels :+ worker(0)
    }
    for (i <- 0 to numOfTasks-1) {
      var minIndex = annoyance.indexOf(annoyance.min)
      var increaseAnnoy = coworkers(minIndex)(1)
      annoyanceLevels = annoyanceLevels.updated(
        minIndex, 
        annoyanceLevels(minIndex)+increaseAnnoy
        )
      annoyance = annoyance.updated(
        minIndex, 
        annoyance(minIndex)+increaseAnnoy
        )
    }
    return annoyanceLevels.max
  }
  
  def main (args: Array[String]): Unit = {
    var linesRaw = io.Source.stdin.getLines
    var lines = List[List[Int]]()
    for (line <- linesRaw) {
      lines = lines :+ line.split(" ").map(_.trim.toInt).toList
    }
    var numOfTasks = lines(0)(0)
    var numOfCoworkers = lines(0)(1)
    var coworkers = lines.tail
    var result = annoyanceLevel(coworkers, numOfTasks, numOfCoworkers)
    Console.out.println(result)
  }
}
