package finaltest

//var is mutable
//val is immutable but can be overriden
// final val is immutable and cannot be overridden

class Vehicle{
  final val speed: Int = 60

  def print(): Unit = {
    println("whatever")
  }
}

class Bike extends Vehicle {
  override def print(): Unit = {
    println("whatever but the second version")
  }
}
object FinalMain extends App{
  var bike = new Bike
  bike.print()
}
