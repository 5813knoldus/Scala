package basics

object BasicExcercise extends App {
    val someValue = {
      2 < 3
    }
    val someOtherValue = {
      if(someValue) 239 else 986
      //42
    }
    println(someValue)
    println(someOtherValue)
}
