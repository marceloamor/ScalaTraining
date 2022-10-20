package akkaStreams
import akka.stream.scaladsl.{Flow, Sink, Source}
import akka.actor.typed.javadsl.Behaviors
import akka.actor.typed._
import scala.concurrent.{ExecutionContext,Future}

import scala.concurrent.Future

//The Akka package introduces Actors, which each perform singular functions but culminatively
//allow for multithreaded computation at scale

object akkaPractice {

  implicit val system = ActorSystem(Behaviors.empty,"ScalaCohort")
  implicit val ec:ExecutionContext=system.executionContext

  val source = Source(1 to 1000)
  val flow = Flow[Int].map(x=> x*2)
  val sink = Sink.foreach[Int](x=> println(x))
  val firstGraph = source.via(flow).to(sink)

  val asyncFlow = Flow[Int].mapAsync(4){
    x => Future{

      x*4

    }
  }

  def main(args: Array[String]): Unit = {
    println("Welcome to Akka World")
    firstGraph.run()
    source.via(asyncFlow).to(sink).run()
  }

}
