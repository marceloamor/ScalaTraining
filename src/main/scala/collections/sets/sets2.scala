package collections.sets

object sets2 extends App {

  var games: Set[String] = Set("Cricket", "Football", "Hockey", "Golf")
  var cities: Set[String] = Set("London", "Singapore", "Vienna", "Kyoto")
  println(games.tail)
  println(games.head)
  println(games.isEmpty)
  println(games.nonEmpty)
  println(games.min)
  //remove element from set
  games += "racing"
  println(games)
  //remove element from set
  games -= "racing"
  println(games)

  //check if any game has a letter
  for (a <- games) {
    println(a + " has the letter o: " + a.contains("o"))
  }
  //merge sets
  var merged = cities ++ games
  println(merged)
}
