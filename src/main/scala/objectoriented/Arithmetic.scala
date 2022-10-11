package com.scala.objectoriented

class Arithmetic {
  def add(a: Int, b: Int): Unit = {
    var add = a + b
    println("sum=" + add)
  }

  def divide(a: Int, b: Int): Unit = {
    var divide = a / b
    println("sum=" + divide)
  }

}

object MainObject extends App {
  new Arithmetic().add(10,10)
  new Arithmetic().divide(20,10)
}
