package testingMyCode

import org.scalatest.funsuite.AnyFunSuite
import regex.regex1._

class testingRegex extends AnyFunSuite{

  test("checking new date creation using jodaTime") {

    val str = "hello".r
    val source = "hello world"
    str.replaceAllIn(source,"goodbye")
    assert(source.toString === "goodbye world")
  }

}
