//TODO : Write a Scala program to check two given integers, and return true if one of them is 30 or if their sum is 30.
import scala.io.StdIn

object CheckTwoIntegers {
  def main(args:Array[String]) {
    val firstInteger = StdIn.readInt()
    val secondInteger = StdIn.readInt()
    println(check(firstInteger,secondInteger))
  }
  def check(firstNumber:Int,secondNumber:Int): Boolean = {
    val sumOfIntegers = firstNumber + secondNumber
    if ((firstNumber == 30 | secondNumber == 30) | sumOfIntegers == 30) true else false
//    println(result)
  }
}
