package constructors

class PrimaryConstructors(i:Int,name:String) {
  def showDetails(): Unit = {
    println(i+" " + name)
  }

}

object temp extends App {
  var s = new PrimaryConstructors(1, "hello!")
  s.showDetails()
}
