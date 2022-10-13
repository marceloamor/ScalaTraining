package methodOverriding

object methodOverriding extends App{
  var b = new Vehicle()
  b.run
  var c = new Bike()
  c.run

}
class Vehicle {
  def run: Unit = {
    println("vehicle running ")
  }
}

//overrides the default run function from the class of vehicles in the child Bike
class Bike extends Vehicle{
  override def run(): Unit = {
    println("bike running")
  }
}
