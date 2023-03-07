package StringInteger

object CheckInteger {
  def main(args: Array[String]): Unit = {
      println(findInteger("he1llo"))
  }

  def findInteger(string: String): Boolean = {


    var flag =0
    for (index <- 0 until string.length) {
      var chr: Character = string.charAt(index)
      var value = chr.toInt
      if (value < 65) {
        flag = 1
        return true
      } else {
        flag = 0
      }
     // if{flag==1} then return true
    }
    if {flag ==1 } then true else false
  }
}
