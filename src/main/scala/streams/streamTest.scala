package streams

import scala.collection.immutable.Stream.cons

object streamTest extends  App {

  val stream = 1 #:: 2#:: 8#:: Stream.empty
  println(stream)

  println("take first two nums from stream")
  stream.take(2).print()

  println(stream.map(_+5))

  var stream2 = stream.filter(_>4)
  println(stream2)

  var from1toaMil = (1 to 1000000).toStream
  from1toaMil.take(100).print()

  val newStream = cons(1,cons(10,cons(1000,Stream.empty)))
  println(newStream)
  println(s"elements of stream $newStream")



}
