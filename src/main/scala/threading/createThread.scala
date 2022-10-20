package threading

import org.joda.time.DateTime

class createThread extends Thread{
  override  def run(): Unit ={
    try{
      Thread.sleep(3000)
      println("Do parallel computation here"+Thread.currentThread().getName)
      Thread.sleep(2000)
      println("we are back "+Thread.currentThread().getName)
    }catch{
      case e:Exception=> e.printStackTrace()
    }

  }

}
object MainObject extends App{
  var t= new createThread()
  var t1= new createThread()
  var t2= new createThread()
  var t3= new createThread()


  t.start()
  //t.start()
  try{
    println("the current thread name is "+Thread.currentThread().getName)
    t.join()
  }catch{
    case e:Exception=> e.printStackTrace()
  }
  t1.start()
  try{
    println("the current thread name is "+Thread.currentThread().getName)
    t1.join()
  }catch{
    case e:Exception=> e.printStackTrace()
  }

  t2.start()
  try{
    println("the current thread name is "+Thread.currentThread().getName)
    t2.join()
  }catch{
    case e:Exception=> e.printStackTrace()
  }

  t3.start()

}