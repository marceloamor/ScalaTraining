package threading

class myThread extends Thread{
  override def run(): Unit = {
    if (Thread.currentThread().isDaemon){
      println("Daemon thread")
    }else{
      println("other work")
    }
  }
}

object threadUtility extends App{

  var a = new myThread
  var b = new myThread
  var c = new myThread

  a.setDaemon(true)
  a.start()
  b.start()
  c.start()
  //a.start()
}
