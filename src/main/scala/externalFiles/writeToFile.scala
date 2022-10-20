package externalFiles
import java.io.PrintWriter

object writeToFile extends App{
  var name = "Marcelo"
  reflect.io.File("src/main/scala/externalFiles/writeToFileTest.txt").appendAll(s"${name} is a user2\n")
    //writeAll(s"${name} is a user")
}
