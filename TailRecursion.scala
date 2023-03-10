package functions

import scala.annotation.tailrec
import scala.jdk.Accumulator

object TailRecursion extends  App {

  @tailrec
  def concatenateString(string: String, number: Int, accumulator: String): String ={
    if(number <= 0 ) accumulator
    else {
      concatenateString(string, number - 1, string + accumulator)
    }
  }
  print(concatenateString("hello ", 5, ""))

}
