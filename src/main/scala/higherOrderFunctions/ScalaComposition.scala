package com.scala.higherOrderFunctions

object ScalaComposition {

  def main(args: Array[String]): Unit ={
    val result=multiplyBy2(add(2))
    println(result)
  }

  def add(a:Int):Int={
    a+1
  }

  def multiplyBy2(a:Int):Int={
    a*2
  }

}
