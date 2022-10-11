package com.scala.controlstructure

object ForLoops extends App {
  /*to, which includes the last value*/
  /*for (a <- 1 to 20) {
    println(a)
  }
  /*until, but not including*/
  for (a <- 1 until 50) {
    println(a)
  }
/*goes over even numbers */
  for (a <- 1 to 10 if a % 2 == 0) {
    println(a)
  }*/

  for (i<- 1 until 20 by 2){
    println(i)
  }

/*  var result = for( a <- 1 to 10 ) yield a
  for (i<- result){
    println(i)
  }*/


}
