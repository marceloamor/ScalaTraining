import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.flatspec.AnyFlatSpec
import thingsToTest._

class SetSpecsToTest extends AnyFlatSpec {
  "An empty set " should "have size 0" in {
    assert(Set.empty.size === 0)
  }

  it should "produce NoSuchElement when head is invoked" in {
    assertThrows[NoSuchElementException]{
      Set.empty.head
    }
  }

}
