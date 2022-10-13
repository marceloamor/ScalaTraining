package accessControl

class accessExample2{
  protected var a:Int = 10
}

class tempCLass extends accessExample2{
  def display(): Unit = {
    println(a)
  }
}

object accessTest2 extends App {
  var s = new tempCLass
  s.display()
}


//No Modifier / Public = Class(Yes), Companion(Yes), Subclass(Yes), Package(Yes), World(Yes)
//^ Least restrictive

//Protected = Class(Yes), Companion(Yes), Subclass(Yes), Package(No), World(No)
//^ More restrictive than public, but less so than private

//Private = Class(Yes), Companion(Yes), Subclass(No), Package(No), World(No)
//^ Most restrictive
