package com.scala.exception

object mainExceptionTest extends App {
  new exceptionExample2().divide(100,10)
  new exceptionExample2().divide(100,0)

}


class exceptionExample2 {
  def divide(a: Int, b: Int ) ={
    try{
      a/b
      var arr=Array(1,2)
      arr(10)

    }
    catch{
      case e:ArithmeticException=> println("maths issue: " +e)
      case ex: Throwable => println("found unknown: "+ex)
    }
    finally{
      println("rest of code executed")
    }
  }
}
