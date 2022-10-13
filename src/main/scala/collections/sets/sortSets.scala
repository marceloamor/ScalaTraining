package collections.sets

import scala.collection.immutable.SortedSet

object sortSets extends App {
  var num: SortedSet[Int] = SortedSet(5, 65, 9, 1, 45)
  for (a <- num) {
    println(a)
  }
  //num.foreach((elem:Int) => println(elem))
}
