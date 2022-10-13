package objectoriented

class CompanionClass {
  def hello(): Unit = {
    println("this is a companion class")
  }
}

object CompanionObject extends App {
  new CompanionClass().hello()
  println("this is a companion object")

}
