//TODO : Write a Scala program to get the absolute difference between n and 51. If n is greater than 51 return triple the absolute difference.

import scala.io.StdIn

object AbsoluteDifference extends App{
    val number = StdIn.readInt()
    var absoluteDifference = number - 51
    if(number<=51){
      absoluteDifference = (-1)*absoluteDifference
    }else{
      absoluteDifference = absoluteDifference*3
    }
    println(absoluteDifference.toString)

}
