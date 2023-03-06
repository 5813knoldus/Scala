import scala.io.StdIn

object RemoveCharacter {
  private def removeCharacter(string: String, n:Int,numberOfChar:Int): String = {
    string.take(n+1) + string.drop(n+numberOfChar+1)
  }
  def main(args:Array[String]) {
    println("Enter the index of character : ")
    val index = StdIn.readInt()
    println("Enter the String : ")
    val string = StdIn.readLine()
    println("Enter how many character to be removed: ")
    val numberOfCharcter = StdIn.readInt()
    println(removeCharacter(string, index,numberOfCharcter))
  }
}
