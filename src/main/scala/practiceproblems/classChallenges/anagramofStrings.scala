package com.scala.practiceproblems.classChallenges

/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
  Input: s = "anagram", t = "nagaram"
  Output: true
  Example 2:

  Input: s = "rat", t = "car"
  Output: false

  Constraints:
  1 <= s.length, t.length <= 5 * 104
  s and t consist of lowercase English letters.*/


object anagramofStrings extends App {
  println("input a string: ")
  var anagram1: String = scala.io.StdIn.readLine()
  println("input another: ")
  var anagram2: String = scala.io.StdIn.readLine()

  var status = true

  if(anagram1.length != anagram2.length){
    status = false
  }else{
    for (c <- anagram1){
      if (!(anagram2 contains c)) {
        status = false
      }
    }
  }
  if (status){
    println("anagrams!")
  }else{
    println("not anagrams!")
  }
}
