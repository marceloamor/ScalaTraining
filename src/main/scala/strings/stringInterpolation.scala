package strings

object stringInterpolation extends App{
  new StringExample2().show()


}

class StringExample2 {
  var s1 = "Scala string example"
  var version = 2.12
  var year1 = 2022
  def show(): Unit = {
    println(f"This is $s1%s scala version is $version%2.2f up to date year $year1%n")
  }
}