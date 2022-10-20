package threading

object implicitTest extends App {

  //implicit values set default values that can be overriden, but allows you to pass them as is into functions as well

  val value = 10
  implicit val multiplier = 3
  implicit val otherMultiplier = "3"

  def multiply(implicit by:Int)= value *by

  val result = multiply

  println(result)

}
