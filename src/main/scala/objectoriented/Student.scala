package objectoriented

class Student {
  var id: Int = 0;
  var name: String = null;

}

//Making an object the same way we do in all the rest of our programs
//Here we instantiate an an object with the default values from the class StudentClass
//This object is called s, it has an id and a name.

object ExecuteClass extends App {
  var s = new Student()
  println(s.id + "------> " + s.name)
}
