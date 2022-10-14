import org.scalatest.funsuite.AnyFunSuite
import thingsToTest.stackTest

import scala.collection.mutable
import thingsToTest.stackTest._


///can use with BeforeAndAfter, which allows you run a code before or after every test case

class AnyFunSuiteTest extends AnyFunSuite{

  test("pop is invoked on non empty stack") {

    assert(stackTest.result === 2)
    assert(stackTest.stack.size === stackTest.oldSize - 1)
  }
  test("pop is invoked on an empty stack") {
    val emptyStack = new mutable.Stack[Int]
    intercept[NoSuchElementException] {
      emptyStack.pop()
    }
    assert(emptyStack.isEmpty)
  }
  test("testing index out of bound") {
    val s = "hi"
    intercept[IndexOutOfBoundsException] {
      s.charAt(-1)
    }
  }

  test("Testing indexoutofbound with message") {
    val s = "hi"
    val thrown = intercept[IndexOutOfBoundsException] {
      s.charAt(-1)
    }
    //  println()
    assert(thrown.getMessage === "String index out of range: -1")
  }

}
