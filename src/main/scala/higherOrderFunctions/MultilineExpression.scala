package com.scala.higherOrderFunctions

object MultilineExpression extends App {
  println(add1(10,20))
  def add1(i: Int, i1: Int): Int= {
    i+
    i1
  }

}
