package enumeration

//An enumeration is a set of values with named constants
/*
 Enumerations offer an easy way to work with sets of related constants.
 An enumeration, or Enum, is a symbolic name for a set of values.
  Enumerations are treated as data types,
  and you can use them to create sets of constants for use
  with variables and properties.
*/

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
