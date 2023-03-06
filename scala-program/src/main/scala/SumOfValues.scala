//TODO : Write a Scala program to compute the sum of the two given integer values. If the two values are the same, then return triples their sum.

import scala.io.StdIn

object SumOfValues extends  App{
    val firstValue = StdIn.readInt()
    val secondValue = StdIn.readInt()
    var sum = firstValue+secondValue
    if(firstValue==secondValue)
        sum = sum*3
    println(sum.toString)
}
