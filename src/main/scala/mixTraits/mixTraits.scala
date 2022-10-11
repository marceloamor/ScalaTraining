package com.scala.mixTraits


trait Print{
  def print(): Unit
}

abstract class PrintA4{
  def printA4(): Unit
}

class A6 extends PrintA4 with Print{
  override def print(): Unit = {
    println("print sheet")
  }
  override def printA4(): Unit = {
    println(" A4 Sheet")
  }
}


object mixTraits extends App {
  var a = new A6 //with Print      <----- you can also add a trait at runtime here
  a.print()
  a.printA4()
}
