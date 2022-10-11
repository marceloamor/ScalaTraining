package collections

object mainTrialTest extends App {
  var set1 = Set() // an empty set
  //declaring the type as below is less costly in Scala and is good practice
  var games: Set[String] = Set("Cricket", "Football", "Hockey", "Golf")
  println(set1)
  for (a<- games){
    println(a)
  }
  println(games)

}
