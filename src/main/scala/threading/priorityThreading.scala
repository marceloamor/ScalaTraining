package threading



object priorityThreading extends App{
  var t= new createThread()
  var t1= new createThread()
  var t2= new createThread()
  var t3= new createThread()

  //println(Thread.currentThread().getPriority)
  t.start()
  t1.start()
  t2.start()
  t3.start()

  t.setPriority(2)
  t1.setPriority(3)
  t2.setPriority(4)
  t3.setPriority(5)

  /*t.start()
  t1.start()
  t2.start()
  t3.start()*/
  /*
  t.start()
  //t.start()
  try{
    println("the current thread name is "+Thread.currentThread().getName+"and its getting joined by"+t.getName)
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

  t3.start()*/

}