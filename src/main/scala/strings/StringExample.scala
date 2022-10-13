package strings

class StringExample {
  var s1 = "String Scala Example"
  var s2 = "hello scala"
  var s3 = "hello"
  var s4 = " scala"
  var s5 = s3.concat(s4)
  def show(): Unit = {
    println(s1.equals(s2)) //returns false
    println(s2==s5) //returns true
    //lets get a substring
    println(s1.substring(0,5))

  }
}

object tempString extends App {
  new StringExample().show()
}