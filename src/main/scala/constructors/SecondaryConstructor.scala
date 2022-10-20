package constructors

//Mixture between parameterized and default constructor
//The problem here is if we instantiate our class with three
//parameters, it will throw an error because currently it only accepts
//two entries
//To test this, remove the def this() function
//Note some of the code may not work, was playing around with this for a fair while
class SecondaryConstructor(id:Int, name:String) {
  var age:Int=0
  var location: String = "London"
  def showDetails(): Unit ={
    println(id + ", " + name + ", " + age + ", " + location)
  }

    //constructor overloader!!! Can add more parameters and overwrite existing default variables
  def this(id:Int, name:String, age:Int, location:String) {
    this(id,name)
    this.age=age
    this.location = location
  }
}

object Main2 extends App {
  var s = new SecondaryConstructor(1,"marcelo", 343, "Vienna")
  s.showDetails()

}
