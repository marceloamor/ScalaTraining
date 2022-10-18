package enumeration

object donutsEnumeration extends App {

  object Donut extends Enumeration {
    type Donut = Value

    val Glazed = Value("Glazed")
    val Strawberry = Value("Strawberry")
    val Plain = Value("Plain")
    val Vanilla = Value("Vanilla")
  }

  println(s"vanilla donut value ${Donut.Vanilla}")
  println(s"vanilla donut ID is ${Donut.Vanilla.id}")
  println(s"all values:  ${Donut.values}")

  Donut.values.foreach{
    case d if (d == Donut.Strawberry || d == Donut.Glazed) => println("uhm stawbs or glazed")
    case _ => println("rejected")
  }
}
