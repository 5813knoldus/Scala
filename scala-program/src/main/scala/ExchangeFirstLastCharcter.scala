import scala.io.StdIn

object ExchangeFirstLastCharcter {
    def main(args:Array[String]): Unit = {
      print("Enter the String : ")
      val string = StdIn.readLine()
      println(exchangeCharacter(string))
    }
    def exchangeCharacter(string:String) :String = {
      var TempString: String = string
      var firstCharcter = string.take(1)
      var lastCharacter = string.drop(string.length-1)
      TempString = TempString.take(string.length-1) + firstCharcter
      lastCharacter + TempString.drop(1)

    }
}
