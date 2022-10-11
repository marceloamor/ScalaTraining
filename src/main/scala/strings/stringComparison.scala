package com.scala.strings

object CompareString extends App {
  new stringComparison().show()
  new stringComparison().getComparisonInt()
}

class stringComparison {
   var s1 = "Scala string example"
  var s2 = "Hello Scala"
  var s3 = "Hello Scala"
  def show(): Unit = {
    println(s1.compareTo(s2))
  }
  def getComparisonInt(): Unit = {
    val b: Int = s1.compareTo(s2) //returns number of diff characters between strings
    println(b)
  }
}
