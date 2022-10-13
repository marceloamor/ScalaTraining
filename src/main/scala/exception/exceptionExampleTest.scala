package exception

class ExceptionExampleTest4 {
  var toValidate = "abc"
  @throws(classOf[NumberFormatException])
  def validate(): Int = {
    toValidate.toInt
  }
}


object exceptionExampleTest extends App {
  var e = new ExceptionExampleTest4()
  try{
    e.validate()
  }catch{
    case ex:NumberFormatException => println("number format issue")
  }
  println("rest of code executing")
}
