package accessControl

//No Modifier / Public = Class(Yes), Companion(Yes), Subclass(Yes), Package(Yes), World(Yes)
//^ Least restrictive

//Protected = Class(Yes), Companion(Yes), Subclass(Yes), Package(No), World(No)
//^ More restrictive than public, but less so that private

//Private = Class(Yes), Companion(Yes), Subclass(No), Package(No), World(No)
//^ Most restrictive
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
