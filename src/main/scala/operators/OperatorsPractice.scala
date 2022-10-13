package operators

object OperatorsPractice extends App {

  var a =4
  var b = 2
  var c = true
  var d = false
  var result = 0
  var result2 = 0

  // arithmetic operators
  println("addition is " + (a+b))

  println("subtraction is " + (a-b))

  // relation operators
  if (a ==b){
    println("values are same ")
  }else{
    println("not same ")
  }

  //logical operator
  println("logical or of c || d is " + (c || d))

  //Bitwise AND operator is &, boolean AND is &&
  result = a&b
  println("bitwise and is " + result )

  //assignment operator
  println("addition assignment is " + (a+=b))
}
