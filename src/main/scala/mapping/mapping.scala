package mapping

object mapping {
    def add(x:Int, y:Int) = x + y;

    def main(args: Array[String]) {
      val tuple = "Marcelo" -> 22
      println(tuple)

      val data= Map("Person A" ->20,
        "Person B" ->5,
        "Person C"  -> 56,
        "Person D" -> 1)
      println(data.mkString(" ||"))

      case class Person(name:String, isAdult:Boolean)
      val createPerson: (String, Int) => Person=  (name,age) => Person(name,age>18 || age<2)

      val users=data.map(createPerson.tupled)

      println(users)
    }

}
