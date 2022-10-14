import org.scalatest.flatspec.AnyFlatSpec


class WordSpecTest extends AnyFlatSpec{
  "An empty Set" should "have size 0" in {
    assert(Set.empty.size === 0)
  }

  it should "produce NoScuhElementException when head is invoked" in {
    assertThrows[NoSuchElementException]{
      Set.empty.head
    }
  }
}
