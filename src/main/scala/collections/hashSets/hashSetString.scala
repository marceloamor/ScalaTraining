package collections.hashSets

import scala.collection.immutable.HashSet

// manipulating each element within a hashset


object hashSetString extends App {
  var hashSet: HashSet[String] = HashSet("1Marcelo Amorell", "2Aycan Kerr", "3Thomas Sadler", "4Marius Simion")

  hashSet.foreach((element: String) => {
    var string = "update: " + element + "'in charge of: " + element.substring(0,4)
    println(string)
  })

  hashSet.foreach((element: String) => {
    var string = element.substring(0, 5) + element.substring(5, element.length)
    println(string)
  })


}
