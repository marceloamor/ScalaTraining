package practiceproblems.OOPproblems

abstract class Vehicle {
  def make: String
}

abstract class Car extends Vehicle {}
abstract class Bike extends Vehicle {}


class BMW3 extends Car {
  override def make: String = "BMW 3"
}

class VWGolf extends Car {
  override def make: String = "Volkswagen Golf"
}

class RBike extends Bike {
  override def make: String = "310 R Bike"
}

class FireStorm extends Bike {
  override def make: String = "Fire Storm Bike"
}

object VehicleReport { //the single object that defines printVehicle()
  def printVehicle(): Unit = {
    
  }
}




object newnewtestest extends App {
  /*val dogContainer = new PetContainer[VWGolf](new VWGolf)

  val catContainer = new PetContainer[BMW3](new BMW3)
  println(dogContainer.pet.make)
  println(catContainer.pet.make)*/

  val newBMW3 = new BMW3
  val newVWGolf = new VWGolf
  val newRBike = new RBike
  val newFireStorm = new FireStorm
  var listOfVehicles = Array(newBMW3, newVWGolf, newRBike, newFireStorm)

  for (v<- listOfVehicles){
    println(v.make)
  }
  //make list of the vehicles
  // for each in the list:
  // call: VehicleReport.printVehicle(List)

}

/*class PetContainer[P <: Car](p: P) {
  def pet: P = p
}*/
