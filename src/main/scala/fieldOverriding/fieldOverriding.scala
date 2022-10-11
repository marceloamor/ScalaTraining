package com.scala.fieldOverriding

// overriding is a permanent thing, use it when you know you never want to get the base value again
// or want to keep it private for any reason
// because var is readable and writable by all and shared, an overridden val will be specific to this class/object

class Vehicle {
  val speed : Int=60

  def show(): Unit = {
    println(speed)
  }
}

class Bike extends Vehicle{
  override val speed: Int = 100

}


object fieldOverriding extends App {
  var b = new Bike
  b.show()
  var c = new Vehicle
  c.show()
}
