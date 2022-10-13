package practiceproblems.OOPproblems


abstract class Vehicle1(s:String){
  def run()
  def printMake(): Unit ={
    println(s)
  }
}
class Car1(s:String) extends  Vehicle1(s){
  override def run(): Unit = {
    println("car defs running")
  }
}
class Bike1(s:String) extends  Vehicle1(s){
  override def run(): Unit = {
    println("bike defs running")
  }
}
object newtesttest extends App {
  var BMW3 = new Car1("BMW3")
  //new car VW golf
  var VW = new Car1("VW Golf")
  // new Bike -310 R Bike
  var RBike = new Bike1("310 R Bike")
  // new Bike Fire Storm
  var FireStorm = new Bike1("Fire Storm")

  var listOfVehicles = Array(BMW3, VW, RBike, FireStorm)
  for (v<- listOfVehicles ){
    v.printMake()
  }

  /*BMW3.printMake()
  VW.printMake()
  RBike.printMake()
  FireStorm.printMake()*/

}

