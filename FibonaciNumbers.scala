package functions

import scala.io.StdIn

object FibonaciNumbers extends App {

  def findFibonaci(number: Int) : Int ={
      if(number == 0) 0  else if(number ==1 ) 1 else {
        findFibonaci(number - 1) + findFibonaci(number - 2)
      }
  }

  val number: Int = StdIn.readInt()
  for(index <- 0 to number)
    print(findFibonaci(index)+" ")
}
