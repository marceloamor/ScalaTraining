package collections.maps



object maps1 extends App {

  var map1 = Map(("A", "Apple"), ("B", "Ball"))  //three different ways to initalise a map
  var map2 = Map("A" -> "Apple", "B" -> "Ball")
  var emptyMap:Map[String,String] = Map.empty[String,String]

  println(map1)
  println(map2)
  println(emptyMap)

  println(map1("B"))  //get value mapped to key "B"

  emptyMap = emptyMap + ("D" -> "Dog")
  println(emptyMap)

  emptyMap = emptyMap - ("D")  //adding and subtracting a value to a map
  println(emptyMap)
}
