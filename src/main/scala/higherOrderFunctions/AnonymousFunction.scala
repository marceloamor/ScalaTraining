package com.scala.higherOrderFunctions

//Useful way to write lightweight one off functions

object AnonymousFunction extends App {
  var result1=(a:Int,b:Int)=>a+b
  println(result1(10,10))

  var result2=(_:Int) +(_:Int)
  println(result2(20,20))
}
