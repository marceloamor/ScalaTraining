package inheritance

//self explanatory here
object BasicsInheritance extends App{
  new BusinessPerson
}

class Employee {
  var salary: Float = 50000
}

class Programmer extends Employee {
  var bonus: Int = 5000
  println(salary)
  println(bonus)
}

class BusinessPerson extends Employee {
  var bonus: Int = 9000
  println(salary)
  println(bonus)
}

class CEO extends Employee {
  var bonus: Int = 10000
  println(salary)
  println(bonus)
}
