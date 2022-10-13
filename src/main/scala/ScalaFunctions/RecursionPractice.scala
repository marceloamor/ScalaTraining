package ScalaFunctions

// this is a factorial (!) function

object RecursionPractice {
  def main(args: Array[String]): Unit = {
    var result = functionExample(5)
    print(result)

  }
  def functionExample(a:Int): Int= {
    if (a == 1)
      1
    else
      a * functionExample(a - 1)
  }
}
