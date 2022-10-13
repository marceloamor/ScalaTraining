package exception

class exceptionExample {
  def divide(a:Int, b:Int) ={
    try {
      a / b // exception occurs

    }
      catch{
        case e:ArithmeticException => println(e)
      }
    println("rest of code is executed")
  }
}


object tempCheckException extends App {

  new exceptionExample().divide(200,1)
  new exceptionExample().divide(200,0)
}
