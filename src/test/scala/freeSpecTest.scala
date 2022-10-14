import org.scalatest.freespec.AnyFreeSpec

class freeSpecTest  extends AnyFreeSpec{
  "A Set" -{
    "when empty" -{
      "should have size 0" in {
        assert(Set.empty.size === 0)
      }
    }
  }
  "should produce NoSuchElementException when ead is invoked in"-{
    assertThrows[NoSuchElementException]{
      Set.empty.head
    }
  }
}