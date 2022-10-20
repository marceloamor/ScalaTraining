package collections.maps

//notes found in notebook for collections

object mapMethod extends App {

  val s1 = Set(5,1,3,7,9)
  val result = s1.map(x=>x*x)
  println(result)

  val s2 = Set("Marcelo", "Alex", "Aycan")
  println(s2.map(_.toUpperCase()))
  println()

  val s3 = Set(1,2,3,4,5,6,7,8,9)

  println(s3.filter(_<5))
  println(s3.filter(_<5).map(_*2))


}
