package logTest

import com.typesafe.scalalogging.LazyLogging


object helloWorldWithLog extends App with LazyLogging{
  logger.info("hello world")
}
