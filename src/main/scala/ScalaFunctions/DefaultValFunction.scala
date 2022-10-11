package com.scala.ScalaFunctions

object DefaultValFunction {

  def main(args: Array[String]) : Unit = {
    val result1 = functionExample(14,23)
    val result2 = functionExample()
    val result3 = functionExample(14)
    print(result1 + "\n" + result2 + "\n" + result3)
  }
  // passes in default values of 0 if no other values are passed in.
  //Stops code from breaking if it has no parameters
  def functionExample(a:Int=0, b:Int=0): Int = {
    a + b
  }
}
