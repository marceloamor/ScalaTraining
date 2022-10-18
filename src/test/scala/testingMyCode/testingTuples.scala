package testingMyCode
import org.scalatest.funsuite.AnyFunSuite
import collections.tuples._
import collections.tuples.tuples.{tuple1,tuple2,tuple3,tuple4}


class testingTuples extends AnyFunSuite {

  test("checking tuple data types") {

    assert(tuple1._2.isInstanceOf[Int] === true)
  }
  test("type check") {
    assert(tuple3._2.toString === "4.5")
  }

}
