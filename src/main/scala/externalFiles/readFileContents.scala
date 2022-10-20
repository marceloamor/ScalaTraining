package externalFiles
import scala.io.Source
object readFileContents extends App {

  //manipulating .txt files from within scala
  //attached .txt file used as test to write to .txt

  var file1 = Source.fromFile("C:\\Users\\44799\\Desktop\\scalaTesting1.txt")

  //println(file1.mkString)

  //file1.getLines().foreach(z=> println("Line content is" + z))

  file1.getLines().take(1).foreach(z=> println("Line content is" + z))

  file1.slice(0,2).foreach(println)



}
