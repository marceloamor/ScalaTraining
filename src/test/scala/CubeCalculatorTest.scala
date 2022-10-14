import org.scalatest.funsuite.AnyFunSuite

class CubeCalculatorTest extends AnyFunSuite{
  test("CubeCalculator.cube"){
    assert(thingsToTest.CubeCalculator.cube(3)  === 27)
    assert(thingsToTest.CubeCalculator.cube(1)  === 1)
    assert(thingsToTest.CubeCalculator.cube(-1)  === -1)
    assert(thingsToTest.CubeCalculator.cube(3)  === 27)
    assert(thingsToTest.CubeCalculator.cube(3)  === 27)

  }
}