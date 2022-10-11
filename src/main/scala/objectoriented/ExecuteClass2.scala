package com.scala.objectoriented

object ExecuteClass2 extends App {
  var s = new Student1( id = 100, name = "Marcelo")
  s.show()


}

class Student1(id:Int, name:String) {
  def show(): Unit ={
    println(s"$id ----> $name")
  }

}
