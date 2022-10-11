package com.scala.methodOverloading

//adding multiple functions in a class that take different parameters
//this chooses which method to apply depending on the parameters detected


class mathsComputation {
  def add(a:Int, b:Int): Unit = {
    var sum= a+b
    println(sum)

  }

  def add(a:Int, b:Int, c:Int): Unit={
    var sum = a + b + c
    println(sum)
  }

  def add(a: Int, b: Double): Unit = {
    var sum = a + b
    println(sum)
  }

  def add(a:String): Unit = {
    println("string, no integers detected")
  }
}

object Maintemp extends App {
  var a = new mathsComputation()
  a.add(5,2)
  a.add(5,2,6)
  a.add(5,2.5)
  a.add("hello")
}
