package exception

class throwException {
  def validate(age:Int): Unit = {
    if (age<18){
      throw new ArithmeticException("you are not old enough")
    }else if (!age.isValidInt){
      throw new ArithmeticException("not an age...")
    }else{
      println("nice ur old enough")
    }
  }
}

object MainObject {
  def main(args:Array[String]): Unit = {
    var e = new throwException
    e.validate(20)
  }
}
