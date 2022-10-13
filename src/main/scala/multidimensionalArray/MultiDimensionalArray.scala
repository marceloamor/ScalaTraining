package multidimensionalArray

object MultiDimensionalArray extends App {

  var a = new MultiDimensionalArray
  a.show

}

class MultiDimensionalArray {
  //ONEWAY TO DECLARE!!
  //var arr = Array.ofDim[Int](2,2)
  //arr(1)(0) = 15
  //ANOTHER WAY TO DECLARE
  var arr1 = Array(Array(1,2,3,4,5), Array(6,7,8,9,10))

  println(arr1.length-1)
  println(arr1(0).length-1)

  println(arr1(1).length-1)

  def show ={
    for (i <- 0 to 1){
      for( j <- 0 to arr1(1).length-1){
        print(" " + arr1(i)(j))
      }
      println(" ")
    }
  }
}