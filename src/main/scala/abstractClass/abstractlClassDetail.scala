package abstractClass


//An abstract class is a class that cannot be instantiated
//It can contain abstract methods or normal methods
//It can only be instantiated by inheriting with a normal class
//And then defining the methods yourself
//It's good to use when you don't know all the functionality of the class
//you are making, you can implement the parts you do know, and leave the parts
//you don't bodiless, ready for those who do know, to fill out the functionality
//for you in extended classes
abstract class Bike(a:Int){
  var b:Int=20
  var c:Int=25
  def run()
  def performance(): Unit ={
    println("perf doing alright")
  }
}
class tesla(a:Int) extends  Bike(a){
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
