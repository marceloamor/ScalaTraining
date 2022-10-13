package methodOverriding

class CentralBank {
  private val centralRate = 1

  def showRate(): Int = {
    centralRate
  }
}

class Barclays extends CentralBank {
  val barclaysRate = 2

  override def showRate(): Int = {
    val newRate = super.showRate() + barclaysRate
    newRate
  }
}

class Lloyds extends CentralBank {
  val lloydsRate = 3

  override def showRate(): Int = {
    val newRate = super.showRate() + lloydsRate
    newRate
  }
}


//override and print the new rates (not working tho need to fix)
object methodOverridingPractice extends App{
  var c = new Barclays
  c.showRate()
  var d = new Lloyds
  d.showRate()
}

