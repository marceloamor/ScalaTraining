package arrays

//default initialised values for an array of Ints and Longs is 0
// for Doubles and Floats it 0.0
// for Boolean its false
// for Char its \u000 null character
//

class ArrayExample2{
  var arr = new Array[Float](5)
  def show(): Unit = {
    for (a <- arr){
      println(a+2)
    }
  }
}
object practiceArray2 extends App {
  var a = new ArrayExample2
  a.show()
}
