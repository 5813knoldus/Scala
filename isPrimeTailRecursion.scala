package functions

import scala.annotation.tailrec
import scala.io.StdIn
import scala.jdk.Accumulator

object isPrimeTailRecursion extends App {

  def isPrime(number: Int) : Boolean = {
    @tailrec
    def isPrimeRecursion(tempNumber: Int, accumulator: Boolean): Boolean = {
      if(!accumulator) false
      else if(tempNumber <= 1) true
      else isPrimeRecursion(tempNumber - 1 , number % tempNumber != 0 && accumulator)
    }
    isPrimeRecursion(number / 2 , true)
  }
  println(isPrime(StdIn.readInt()))
}
