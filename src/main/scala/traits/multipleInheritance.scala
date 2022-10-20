package traits

//Traits are basically the same as java interfaces
//They are completely abstract classes essentially
//NOTE that multiple inheritance is possible with traits
trait Printable{
  def Print()
}
class A5 extends Printable{
  override def Print(): Unit = {
    println("Its an a5 page")
  }
}
object practisetrait extends App {
  var a:Printable =new A5()
  a.Print()
}
