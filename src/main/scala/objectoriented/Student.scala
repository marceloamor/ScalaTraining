package com.scala.objectoriented

class Student {
  var id: Int = 0;
  var name: String = null;

}


object ExecuteClass extends App {
  var s = new Student()
  println(s.id + "------> " + s.name)
}
