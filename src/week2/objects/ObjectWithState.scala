package week2.objects

object ObjectWithState {

  // State of the object
  var x: Int = 10

  // Behavior of the object
  def doubleX(): Unit = {
    this.x *= 2
  }

}
