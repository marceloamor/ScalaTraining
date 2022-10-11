package com.scala.objectoriented

//case class CaseClass(parameters)
trait Car

case class Tesla(a:Int, b:Int) extends Car
case class BMW(a:Int) extends Car
case object Mercedes extends Car


object MainCaseClass extends App {
  callCase(Tesla(10,10))
  callCase(BMW(10))
  callCase(Mercedes)

  def callCase(f:Car) = f match{
    case Tesla(f,g)=> println("a="+f+"b="+g)
    case BMW(f)=> println("a="+f)
    case Mercedes=> println("No Argument")
  }


}
