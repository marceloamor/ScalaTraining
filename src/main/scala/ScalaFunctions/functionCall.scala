package ScalaFunctions

object functionCall {
  def main(args: Array[String]): Unit = {
    var result = functionExamModify1()
    println(result)
    functionExample(10,20)
  }

  //without parameters
  def functionExam(): Unit = {
    println("Simple function")
  }

  def functionExamModify1(): Int = {
    var a = 10
    a
  }

  //with parameters
  def functionExample(a:Int,b:Int): Unit ={
    var c= a+b
    c
  }

}
