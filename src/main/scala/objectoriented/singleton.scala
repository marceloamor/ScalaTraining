package com.scala.objectoriented

object singleton {
  def main(args:Array[String]): Unit ={
    //call this wherever youd like and itll update that count
    SingletonObject.increment()

  }
}
//singleton object that basically holds one value and a method to update it
 object SingletonObject{
   var count = 0
   def increment(): Unit ={
     count += 1
     println(count)
   }
 }