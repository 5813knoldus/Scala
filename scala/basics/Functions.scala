package basics

import scala.io.StdIn

object Functions extends App {

  def parameterlessFunction() : Int = 43
  def functionWithParametee(name: String, age: Int ) : String = {
    if(age < 18 ) s"${name} is under age with age " + s"${age}" else s"${name}! your age is greater than " + 18
  }

    //Calling a parameter less function with parenthesis
  println(parameterlessFunction())

  //Calling a parameter less function with parenthesis
  println(parameterlessFunction)

  //Calling functionWithParameter


  def isValidName(name: String ): Boolean = {
    var flag = 0
    for( index <- 0 to name.length-1){
      val character = name.charAt(index)
      val intValueOfCharcter = character.toInt
      if(intValueOfCharcter < 65){
        flag = 1
        return false
      }
      else
        flag = 0
    }
    if(flag == 1 )  false else true
  }

  val name: String = StdIn.readLine()
  val age: Int = StdIn.readInt()

  if(isValidName(name)) println(functionWithParametee(name , age )) else println(s"Please Enter a valid name !!! ")

}
