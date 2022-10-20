package constructors

//No attributes, this has a default a constructor
//This should print "Default" when instantiated
class DefaultConstructor {
  println("Default Constructor")

}

object Main extends App {
  val a = new DefaultConstructor
}
