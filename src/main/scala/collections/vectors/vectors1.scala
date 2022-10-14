package collections.vectors

object vectors1 extends App {

  //if given a choice between vector and array, use vector
  // better for doing things in parallel
  var vector: Vector[Int]= Vector(5,2,6,7,9,1)
  var vector2 = Vector(5.1,3,7,3,9,1)
  var vector3: Vector[String] = Vector.empty
  println(vector)
  println(vector2)
  println(vector3)

  //append an element
  vector3 = vector3 :+ "racing"
  println(vector3)

  var mergeVector = vector2.concat(vector3)
  println(mergeVector.reverse)

  var sortedVector = vector2.sorted

  var from1to5 = 1 to 5
  println(s"$from1to5")

  var from1to100 = (1 to 100).toList
  from1to100.foreach(((elem:Int)=> println(elem)))

  var arrayFrom1to50 = (1 to 300).toArray
  arrayFrom1to50.foreach(println(_))
}


