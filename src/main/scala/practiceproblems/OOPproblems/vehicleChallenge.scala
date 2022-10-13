/*
package practiceproblems.OOPproblems

/*

Write a program that:
-Defines a base abstract class to model a Vehicle type with
    -public make property of type String
-This particular Vehicle base class will be extended by two sub-types to receive the make property
    -Car case class
    -Bike case class
-Create a singleton object named VehicleReport that will define a printVehicles() method that:
    -takes a List of Vehicle types, and any sub-types or sub-classes
    -it will iterate through each vehicle type and output its make property
    -note that it will have no return type defined as such

-Use the following vehicle samples:
    -Car
        -BMW 3 Series
        -VW Golf
    -Bike
        -310 R Bike
        -Fire Storm Bike
-Use the List data structure to store the above-mentioned vehicles
-Call the VehicleReport's printVehicles() method by passing through your collection of vehicles as defined above
*/
//// old code
abstract class Bike2(a:Int){
  var b:Int=20
  def run()
  def performance(): Unit ={
    println("perf doing alright")
  }
}
class tesla(a:Int) extends  Bike2(a){
  c=30
  override def run(): Unit = {
    println("motor defs running")
    println(a)
    println(b)
    println(c)
  }
}
object abstractClassDetail extends App {
  var h = new tesla(10)
  h.run()
  h.performance()
}

/////////my new code
abstract class Vehicle2{

}

class Car(s:String) extends Vehicle2 {
  var make(String) = s
}

object VehicleReport{ //the singleton object that defines printVehicle method()
  /*takes a List of Vehicle types, and any sub - types or sub - classes
  -it will iterate through each vehicle type and output its make property
  -note that it will have no return type defined as such*/

}

object vehicleChallenge extends App {
  var BMW3 = new Vehicle2("BMW 3 Series")
}




*/
