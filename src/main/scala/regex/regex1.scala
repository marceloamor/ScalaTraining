package regex

object regex1 extends App {

  val str = "hello to all".r
  val source = "hello to all from this world, hello to all"
  println(str.findFirstIn(source))
  str.findAllMatchIn(source).foreach(x=>println(x))

  val str1 = "ma".r
  val source1 = "aMaze"
  println(str1.findFirstIn(source1.toLowerCase))

  val str2 = "hello".r
  val source2 = "hello world"
  println(str2.replaceAllIn(source2, "goodbye"))

  //anything that ends with 'k'
  val strcheck = "check"
  val finalstr = strcheck.matches(".*k")
  println(finalstr)

  //splits the test string at every instance of the target 'ng', up to a max of 2 instances
  val str3 = "something to test result"
  var finalstr3 = str3.split(".ng",2)
  for (sq <- finalstr3){
    println(s"here is the array: ${sq}")
  }
}
