package collections.sets

object iterateOverSet extends App {
  var games = Set("Cricket", "Football", "Hockey", "Golf", "Golf")
  var games2 = Set("Golf", "Ping Pong", "Hockey", "Golf")
  for (a <- games) {
    println(a)
  }
  //games.foreach((elem:String)=>println(elem))
  println(games.union(games2)) //combines them into a hashset
  println(games.intersect(games2)) //creates a set of the items in common


}
