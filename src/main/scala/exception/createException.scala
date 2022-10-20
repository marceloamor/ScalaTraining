package exception


class divisibleBy2(s:String) extends Exception{
  override def toString: String = super.toString+ " ------> " + s
}
class divisibleBy3(s:String) extends Exception{
  override def toString: String = super.toString+ " ------> " + s
}
class divisibleBy5(s:String) extends Exception{
  override def toString: String = super.toString+ " ------> " + s
}

class ExceptionExample3{
  @throws(classOf[divisibleBy2])
  @throws(classOf[divisibleBy3])
  @throws(classOf[divisibleBy5])
  def validate(num:Int): Unit = {
    if (num % 2 == 0) {
      throw new divisibleBy2("can / by 2")
    } else if (num % 3 == 0) {
      throw new divisibleBy3("can / by 3")
    } else if (num % 5 == 0) {
      throw new divisibleBy5("can / by 5")
    }else{
      println("probs prime")
    }
  }
}

object createException extends App {
  println("input a prime: ")
  var num: Int = scala.io.StdIn.readInt()

  var e = new ExceptionExample3
  try{
    e.validate(num)
}catch{
    case e: divisibleBy2 => println("exception occured: " + e)
    case e: divisibleBy3 => println("exception occured: " + e)
    case e: divisibleBy5 => println("exception occured: " + e)
  }
}
