package methodOverloading

//lazy variables are only instantiated when they are used, until then they are not

object LazyEvaluation extends App {
  lazy val myExpensiveValue = myExpensiveFunction
  val settings: Boolean = true


  if(settings){
    var temp = myExpensiveValue
    println("name is " + temp)
  }else{
    println("nah dont do it mate")
  }


  def myExpensiveFunction(): String = {

    "Marcelo"
  }
}

