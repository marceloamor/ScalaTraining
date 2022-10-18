package testingMyCode
import org.scalatest.funsuite.AnyFunSuite
import dates.datePractice.{newDate, newDate2}
import org.joda.time.DateTime

class testingDates extends AnyFunSuite {

  test("checking new date creation using jodaTime") {

    val newDate = DateTime.now()
    val newDate2 = new DateTime(2022, 3, 26, 12, 0, 0, 0)
    assert(newDate2.isBefore(newDate) === true)
  }

}
