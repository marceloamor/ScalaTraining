package accessControl

class AccessExample{
  private var a: Int = 10
  def show(): Unit = {
    println(a)
  }
  def set(a1: Int): Unit = {
    a=a1
  }
}


object accessTest extends App {
  var p = new AccessExample
  p.set(98)
  p.show()
}
