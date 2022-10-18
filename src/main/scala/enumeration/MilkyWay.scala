package enumeration

//Enumerations are a good way to store a list of constants and allow you to access them efficiently
// Like planets, days of the week, months, etc

object MilkyWay extends Enumeration {

  type Planets = Value

  val Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune = Value

  val Pluto = Value(9, "Pluto")
  val Zoto = Value(10,"Zoto")

  def isMilkyWay(planets: Planets):Unit = {
    println(s"Planet ${planets.id} and ${planets}")
  }

  def isPlanet(planet:String): Unit ={
    val check = MilkyWay.values.toList.map(v=>v.toString).contains(planet)
    println(s"planet $planet belongs to milkyway is $check")
  }

  def getOrder(planets:Planets): Unit = {
    var suffix = "th"
    if (planets.id % 10 == 1){suffix = "st"}
    else if(planets.id % 10 == 2){suffix = "nd"}
    println(s"The planet $planets is the ${planets.id}${suffix} planet in the solar system")
  }

  def main(args: Array[String]): Unit = {
    println(s"the se of values of type planets that miilky way holds ${MilkyWay.values}")

    isMilkyWay(MilkyWay.Mercury)
    isMilkyWay(MilkyWay.Venus)
    isMilkyWay(MilkyWay.Mars)
    isMilkyWay(MilkyWay.Jupiter)

    isPlanet("Earth")

    getOrder(MilkyWay.Earth)

  }

}
