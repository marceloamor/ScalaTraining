package dates

import java.util.Date  //using the Java package
import org.joda.time.DateTime

object datePractice extends App {

  var date1 = new Date()
  println(date1)

  val date2 = new Date(2020,8,2)
  val date3 = new Date(99,10,3)
  println(date3)

  //using jodaTime
  var newDate = DateTime.now()
  var newDate2 = new DateTime(2022, 3, 26, 12, 0, 0, 0)
  println(newDate)
  println(newDate2.isBefore(newDate))

}
