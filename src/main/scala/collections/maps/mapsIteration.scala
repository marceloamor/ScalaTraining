package collections.maps

import scala.collection.immutable._

object mapsIteration extends App {

  var hashMap = HashMap("A" -> "Apple", "B" -> "Ball", "C" -> "Cat")

  hashMap.foreach{
    case(key,value) => println(key+"-->"+value)  //print keys and values for each item
  }

  println(hashMap("B"))
  hashMap = hashMap + ("D"->"Doll")

  println(hashMap.toList.head.swap) //casting it to List creates a list of Tuples that are easy to manipulate


}
