package collections.bitSet

import scala.collection.immutable.BitSet

object manipulatingBitSet extends App {

  var nums = BitSet(1,2,3,5,8)
  var nums2 = BitSet(4,6,8,3)
  nums.foreach((elem: Int) => println(elem))
  nums.foreach((elem: Int) => println(elem))
  nums -= 21
  println()
  nums.foreach((elem: Int) => println(elem))

  for (a <- nums){
    for (b <- nums2){
      println(a+b)
    }
  }

}
