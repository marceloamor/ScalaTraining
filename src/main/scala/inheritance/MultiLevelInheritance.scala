package inheritance

trait fromA {
  var salaryTrait = 10
}

class A {
  var salary1 =10000
}

class B extends A {
  var salary2 = 200000
}

class C extends B with fromA {
  def show(): Unit = {
    println("salary1: "+ salary1)
    println("salary2: "+ salary2)
    println("salaryTrait: "+ salaryTrait)
  }
}

object MultiLevelInheritance extends App {
  var c = new C
  c.show()
}
