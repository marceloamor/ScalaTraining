package regex
import scala.util.matching.Regex

object numbersInDigits extends App {

  //print every digit in a string and return it in a comma separated string
  val reg = new Regex("\\d") //a capital D would return all non digits
  val str = "to check digit 520 in string"
  println(reg.findAllIn(str).mkString(", "))

  val reg2 = new Regex("\\D") //a capital D would return all non digits
  val str2 = "to check digit 520 in string"
  println(reg2.findAllIn(str2).mkString(", "))

  val reg3 = new Regex("\\S")
  val str3 = "to check digit 520 in string"
  //didnt get to it

  val reg4 = new Regex("\\S")
  val str4 = "to check digit 520 in string"
  println(reg4.findAllIn(str4).mkString(", "))

  val reg5 = new Regex("\\s")
  println(reg5.findAllIn(str).mkString(", "))

  val reg6 = new Regex("q|r")
  val str6 = "check regular expression"
  println(reg6.findAllIn(str6).mkString(" , "))

  val reg7 = new Regex(".")
  val str7 = "check for new line"
  println(reg7.findAllIn(str7).mkString(", "))

}
