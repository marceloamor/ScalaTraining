package typeHierarchy

object typeHierarchy extends App {

  println("declare variable of type Any") //anything whatsoever, scala or java
  val favouriteItem: Any = "GlazedDonut"
  println(favouriteItem)
  println("\n Declare a type reference") //AnyRef extends Any, is used for any non-val items and user-defined types
  val pizza: AnyRef = "Cheesepizza"
  println(pizza)
  println("\nDeclare variable of type AnyVal") // basically anything that isnt a list
  val pricePizza: AnyVal = 4.5
  println(pricePizza)

  var myList = Nil    //nothing of type string
  println(myList.length)

  println(None.toList)
}