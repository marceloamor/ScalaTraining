package com.scala.exception

class exceptionTest4 {
  def divideBigNumbers(a:Int, b:Int) = {
    try {
      if (a < 100 || b < 100){
        throw new ArithmeticException("big numbers only!")
      }

    }catch{
      case e: ArithmeticException => println("maths issue: " + e)
      case exp: Exception => println("exception: " + exp)
      case th: Throwable => println("unknown: " +th)
    }
    finally{
      println("thinking...")
    }
    println("and the answer is: " + a/b)
  }
}

object exceptionTest4 extends App {
  new exceptionTest4().divideBigNumbers(400,200)
}
