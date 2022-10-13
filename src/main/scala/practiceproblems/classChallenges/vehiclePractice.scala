package practiceproblems.classChallenges

trait CarriesRider {
  var Rider = true
}

abstract class Vehicle1{
  val numberOfTires = "some number of "
  def printTires(): Unit = {
    println("this vehicle has " + numberOfTires + " tires")
  }

}

class Car extends Vehicle1 with CarriesRider {
  override val numberOfTires: String = "4"

  def showDetails(): Unit = {
    printTires()
    println("Is this ridable? " + Rider)
  }

  }

class unknownVehicle extends Vehicle1 with CarriesRider {
  def showDetails(): Unit = {
    printTires()
    println("Is this ridable?: " + Rider)
  }
}

object vehiclePractice extends App{
  var newCar = new Car
  newCar.showDetails()

  var newUnknown = new unknownVehicle
  newUnknown.showDetails()

}
