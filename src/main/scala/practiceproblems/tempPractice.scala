package practiceproblems

object tempPractice extends App {
  var lowNum: Int = 100
  var highNum: Int = 300
  var percentage: Int = 20

  var score:Int=88

  // check if a given number is within 20% of 100 or 300
  // values currently hardcoded, could create a range or create variables to
  if(score>= (lowNum - (percentage/lowNum)) && score <= 120){
    println("true")
  }else if(score >= 240 && score <= 360){
    println("true")
  }else{
    println("false")
  }
// second mini assignment

  var name: String = "Marcelo"
  var version: String = util.Properties.versionString
  printf("Name: %s \nJava Version: %s \n", name, version)
  // OR
  println(s"Name: $name \nJava Version: $version")

  var test1: String = "\fThis is a \ntest of \n THIS WILL ALL BE OMITTED\rwhether \\ we \"can\" write \t \'simple\' statements!$\b"
  println(test1)





}
