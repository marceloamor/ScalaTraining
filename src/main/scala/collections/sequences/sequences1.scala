package collections.sequences

object sequences1 extends App{
  var seq1:Seq[Int]=Seq(52,8,9,1,8,3,7,1)
  var seq2:Seq[Int]=Seq(52,8,32,3,4,6,7,3)
  seq1.foreach((elem:Int)=>println(elem))

  //lets explore!
  println(seq1(2))     //index of 2
  println(seq1.isEmpty)   //if its empty - false
  println(seq1.endsWith(Seq(7,1)))  // if the sequence ends with these values - true
  println(seq1.contains(9))  //if it contains the value 9 -true
  println(seq1.lastIndexOf(1)) //index of the last time that element appears in seq
  println(seq1.reverse)
  println
  println(seq1.appendedAll(seq2)) //appends two sequences together
  println(seq1.indexWhere(a => a%2==0)) //returns index of first even number
}


