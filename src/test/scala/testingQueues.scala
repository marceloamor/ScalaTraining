import org.scalatest.funsuite.AnyFunSuite

import scala.collection.immutable._

class testingQueues extends AnyFunSuite {

  test("first queue is created and properties are alright") {

    val queue1 = Queue(2, 4, 6, 8, 90, 54, 1, 35)
    val length1 = queue1.length

    assert(queue1.dequeue._1 === 2)
    assert(queue1.dequeue._2.length === length1 - 1)
  }


}
