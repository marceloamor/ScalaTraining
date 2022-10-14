package JineshSolutionToMapping

import scala.io.StdIn.{readInt, readLine}


class Student(ID:Int, firstName: String){
  var studentID = ID
  var studentName = firstName
}


object mappingToInt extends  App{

  var testStudent = new Student(0, "0 is not a valid ID")
  var studentRegister: Map[Int, Student] = Map(testStudent.studentID -> testStudent) //a baseline student exists, this can be Admin in the BankingApp

  var option = ""
  while (option != "10") {
    println("Welcome to the student register. What would you like to do\n" +
      "1- Create new student\n" +
      "2- Find student name\n" +
      "3- See all students\n" +
      "10- Log Out\n" +
      "Enter option: ")
    var option = readInt()
    option match {
      case 1 => {
        println("What is the Student's ID?")
        var newID = readInt()
        println("What is the Student's first name?")
        var newName = readLine()
        createNewStudent(newID,newName)
      }
      case 2 => {
        println("What is the Student's ID you would like to search?")
        var searchID = readInt()
        getStudentName(studentRegister,searchID)
      }
      //getStudentName2())}
      case 3 => {} //seeStudents())}
      case 10 => System.exit(10)
    }
  }


  def createNewStudent(ID: Int, firstName: String): Unit = {
    var newStudent = new Student(ID, firstName)
    studentRegister += (ID -> newStudent)
    println("Student Added!")
  }

  def getStudentName(studentRegister: Map[Int, Student], ID: Int): Unit = {
    var studentKeys = studentRegister.keys
    var found = false
    for (a <- studentKeys) {
      if (a == ID) {
        found = true
        println("Student ID: " + ID + "\nStudent Name: " +studentRegister(a).studentName)
      }
      if (!found) {println("Invalid ID, Student not found")}
    }
  }



  //getStudentName(studentRegister, 1)

}