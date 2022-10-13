package abstractClass

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
