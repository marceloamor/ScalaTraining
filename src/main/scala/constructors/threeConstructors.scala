package constructors

class Student(id:Int, name:String){
  var age:Int = 0
  def show(){
    println(id+" "+name+" "+ age)
  }
  def this(id:Int, name:String,age:Int){
    this(id,name)       // calling primary constructor
    this.age = age
  }
}


object threeConstructors extends App {
    var s = new Student(101, "marcelo", 22);
    s.show()

}
