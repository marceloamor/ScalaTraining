package practiceproblems

import scala.util.control.Breaks._


object practice3 extends App {

//!!!posititve or negative number
 /* println("input a number: ")
  var num: Int = scala.io.StdIn.readInt()
  if (num >= 0){
    println("positive")
  }else{
    println("negative")
  }*/

  // !!! check if prime number
  /*println("input a number: ")
  var prime: Int = scala.io.StdIn.readInt()
  breakable {
    for (i <- 2 to prime-1) {
      if ((prime % i) == 0) {
        println("not prime")
        break
      }
    }
    println("prime")
  }*/


  //!!!check temp is less than 0 or more than 100
  /*println("input first number: ")
  var temp1: Int = scala.io.StdIn.readInt()
  println("input second number: ")
  var temp2: Int = scala.io.StdIn.readInt()
  if (temp1 >= 0) ///ok im gonna stop here cause this one is quite easy*/

  // reverse digits in integer (using .reverse method)
/*  println("input number: ")
  var toReverse: Int = scala.io.StdIn.readInt()
  println(toReverse.toString.reverse.toInt)*/

  //frequency of digit in integer
  /*println("input number: ")
  var frequency: Int = scala.io.StdIn.readInt()
  println("input digit to find frequency of: ")
  var digit: Int = scala.io.StdIn.readInt()
  var count = 0
  while (frequency > 0){
    if (frequency % 10 == digit){
      count += 1
    }
    frequency /= 10
  }
  println(count)*/

  //!!!! sum first and last digit of integer !!!!not done !!!!!!!!!!!!
 /* println("input number: ")
  var toSum: Int = scala.io.StdIn.readInt()
  var length = toSum.toString.length
  var first = toSum % (scala.math.pow(10,length-1))
  var last = toSum % 10
  println("first: " + first + "last " + last + "legnth " + length)*/

  //!!!!!!!! program to represent list with sequence of number from 100 to 150
  /*val currentList = (100 to 150).toList
  print(currentList)*/

  //!!!!!!!!!! permutations of a string !! not done`
  /*println("input name: ")
  var namePermutation: String = scala.io.StdIn.readLine()
  def findPermutations(string: String): Unit ={
    string.permutations.toList
  }
  println(findPermutations(namePermutation))*/



  /*var age: String = scala.io.StdIn.readLine()
 println(f"Hello $name , aged $age")*/


}
