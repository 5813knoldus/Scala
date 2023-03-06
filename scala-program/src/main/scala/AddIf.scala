import scala.io.StdIn

object AddIf extends App{
  var string = StdIn.readLine()
  println(addIf(string))

  def addIf(string:String) : String = {
      if(string.startsWith("if")) string else "if"+string
  }

}
