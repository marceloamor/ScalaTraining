package exception

class exceptionTest3 {
  def divide(a:Int, b:Int) = {
    try {
      a/b
      var area = Array(1,2)
      area(10)

    }catch{
      case e: ArithmeticException => println("maths issue: " + e)
      case exp: Exception => println("exception: " + exp)
      case th: Throwable => println("unknown: " +th)
    }
    finally{
      println("and this bit is always executed")
    }
    println("done")
  }
}

object exceptionTest3 extends App {
  new exceptionTest3().divide(100,0)
}
