package com.scala.practiceproblems.classChallenges

/*Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

  Example 1:

  Input: num1 = "2", num2 = "3"
  Output: "6"
  Example 2:

  Constraints:
  1 <= num1.length, num2.length <= 200
  num1 and num2 consist of digits only.
  Both num1 and num2 do not contain any leading zero, except the number 0 itself.*/

object sumOfStrings extends App {
  println("input a number: ")
  var num1: String = scala.io.StdIn.readLine()
  println("input a number: ")
  var num2: String = scala.io.StdIn.readLine()
  println((num1.toInt + num2.toInt).toString)

}
