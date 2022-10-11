package com.scala.arrays

class practiceArray1 {
  //one way to declare array
  var arr= Array(1,2,3,4,5,6,7,8,9)
  //another way:
  //var arr1 = new Array[String](30
  //another way with type declaration:
  //var arr2: Array[String]= new Array[String](30)
  def show(): Unit = {
    for (a<- arr){
      println(a)
    }
    println("print third elem: " + arr(2))
  }
}

object practice extends App {
  var a = new practiceArray1
  a.show()
}
