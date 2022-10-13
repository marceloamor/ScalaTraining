package collections.listSet

import scala.collection.immutable.ListSet

object listSet1 extends App {
  var listSet: ListSet[Int] = ListSet(3,5,2,7,9,10,457)
  listSet.foreach((elem:Int)=> println(elem))

  println(listSet.isEmpty)


}
