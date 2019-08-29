package week1.basics

object Conditional {

  def computeSize(input: Double): String = {
    var large: Double = 60.0
    var medium: Double = 30.0
    if (input >= large) {
      "1"
    } else if (input >= medium) {
      "2"
    } else {
      "3"
    }
  }

  def main(args: Array[String]): Unit = {
    println(computeSize(70.0))
    println(computeSize(50.0))
    println(computeSize(10.0))
  }

}

