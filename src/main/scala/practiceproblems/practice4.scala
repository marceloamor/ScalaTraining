package com.scala.practiceproblems

object practice4 extends App {

  //prompt users for name age and

  //Scala program to find i'th character in string
  println("input a string: ")
  var stringInput: String = scala.io.StdIn.readLine()
  println("input the index of target char: ")
  var num: Int = scala.io.StdIn.readInt()
  var targetChar =  stringInput.charAt(num-1)
  println(targetChar)

  // function that removes factors of 2 until a non factor is found -- Marius Solution -- same as my solution from yesterday
  /*import scala.collection.mutable.ListBuffer

  object stopWhenNotEven extends App {
    var arr = ListBuffer(2,8,19,20,25,50,100,10)

    var even = true

    while (even) {
      if (arr.head % 2 == 0) {
        arr.remove(0)
      } else {
        even = false
      }
    }
    for (x <- arr) {
      print(x + " ")
    }
  }*/

  //


}
