package traits

trait Printable1{
  def Print()
}

class A4 extends Printable1{
  override def Print(): Unit = {
    println("its an A4 page")
  }
}


object traitPractice extends App {
  var a:Printable1 = new A4()
  a.Print
}
