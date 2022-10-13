package patternmatching

object MixTypes {
  def main(args:Array[String]): Unit ={
    var result =search(5.77)
    println(result)
  }
  def search(a:Any):Any=a match {
    case 1 => {print("One")
      1}

    case "two" => {
      print("two")
      2
    }
    case "hello" => {
      println("hello")
      3
    }
    case 5.77 => {
      print("5.77")
      4
    }
    case _ => {
      println("Nothing selected")
      5
    }
  }
}
