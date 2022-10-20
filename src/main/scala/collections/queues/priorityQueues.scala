package collections.queues

import scala.collection.mutable.PriorityQueue

//notes found in notebook for collections

object priorityQueues extends App {

  case class Donut(name:String, price:Double)

  def donutOrder(d:Donut) = d.price

  val priorityQueue:PriorityQueue[Donut] = PriorityQueue(
    Donut("plain donut",1.50),Donut("Strawberry",4),Donut("Chocolate",2.4))(Ordering.by(donutOrder)
  )
  println(s"element of priority queues are $priorityQueue")

  priorityQueue.enqueue(Donut("Glazed", 1.2))

  println(priorityQueue)
}
