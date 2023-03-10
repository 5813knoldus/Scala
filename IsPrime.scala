package functions

import scala.io.StdIn

object IsPrime extends App {

  def isPrime(number: Int) : Boolean ={
    def isPrimeUntil(tempNumber: Int) : Boolean = {
      if(tempNumber <= 1) true
      else number % tempNumber !=0 && isPrimeUntil(tempNumber - 1)
    }
    isPrimeUntil(number / 2)
  }

  println(isPrime(StdIn.readInt()))
}

