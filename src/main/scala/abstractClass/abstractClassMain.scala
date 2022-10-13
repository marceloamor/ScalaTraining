package abstractClass

//abstract class is a class that is used as a template, but is not used to create instances of itself
// an "expert" class because it just gives its own expertise but doesnt do

abstract class Bike1{
  def run()
}

class BMX extends Bike1 {
  override def run(): Unit = {
    println("motor runniong fine")
  }
}


object abstractClassMain extends App {
  var h = new BMX
  h.run()
}
