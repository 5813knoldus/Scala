import scala.io.StdIn

object CreateNewString extends App {

  def createNewString(oldString: String): String = {
    if (oldString.length < 2) oldString
    else {
      val newString: String = oldString.take(2)
      newString * 4
    }
  }

  def createNewStringBackFront(string: String): String = {
    val lastCharcter: String = string.drop(string.length - 1)
    val newString: String = lastCharcter + string
    newString
  }

  def createNewStringWithThreeNewCharacter(oldString: String): String = {

    if (oldString.length < 3) oldString
    else {
      val subString: String = oldString.substring(0, 3)
      subString + oldString + subString
    }
  }

  println(createNewString(StdIn.readLine()))
  println(createNewStringBackFront(StdIn.readLine()))
  println(createNewStringWithThreeNewCharacter(StdIn.readLine()))
}
