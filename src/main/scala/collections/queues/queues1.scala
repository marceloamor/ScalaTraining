package collections.queues

import scala.collection.immutable._

object queues1 extends App {

  var queue1 = Queue(3,34,5,56,7,78,9,4)
  var queue2:Queue[Int] = Queue(86,3,5,73,74,23,6)

  println(queue1)
  println(queue2)

  var firstElem = queue1.front  //prints first element in the queue
  println(firstElem)

  queue1.foreach((element:Int) => { //prints evert element plus 4
    println(element + 4)
  })

  var enqueueQ = queue1.enqueue(3)   //adds 3 to the rear of the Q
  enqueueQ.foreach((element: Int) => {
    println(element)
  })

  var dequeuingQ = queue2.dequeue //prints the queue as a Tuple, of the first element, then the rest following
  println(dequeuingQ)             // access with dequeue._1 and dequeue._2

  var dequeue2 = dequeuingQ._2.dequeue  //dequeues the second element of the Tuple, which was the dequeued part from the first dequeue
  println
  println(dequeue2)

  println(queue2.sorted)
}
