package patternmatching

object MatchNumbers extends App {
var a=1.0
  a match {
    case 1 => println("One")
    case 1.0 => print("Two")
    case _ => println("No")
  }

}
