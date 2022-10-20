package controlstructure


object controlstructure extends App {
var score:Int=88
  if(score>=0 && score < 50){
    println("fail")
  }else if(score >= 50 && score <= 90){
    println("not bad")
  }else{
    println("stellar")
  }

}
