import collections.tuples._
import collections.tuples.tuples.{tuple1, tuple3}
import org.scalatest.funsuite.AnyFunSuite


class testingTuples extends AnyFunSuite {

  test("checking tuple data types") {

    assert(tuple1._2.isInstanceOf[Int] === true)
  }
  test("type check") {
    assert(tuple3._2.toString === "4.5")
  }

}
