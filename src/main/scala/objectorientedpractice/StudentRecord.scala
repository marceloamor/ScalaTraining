package com.scala.objectorientedpractice

class StudentRecord (id:Int,name:String){
  def getRecord() : Unit = {
  println (id + "  " + name)
  }

}

  object MainObject extends App {
    println("What is your name?")
    var studentName = scala.io.StdIn.readLine()
    var student1 = new StudentRecord(101, studentName)
    student1.getRecord()
  }