package breaktesting

import scala.util.control.Breaks.{breakable, break}

//breaks are not ways recommended, but can be helpful
object breaks extends  App {
  breakable{
    for (i<- 1 to 10 by 2){
      if (i==7){
        break
      }else{
        println(i)
      }
    }
  }

}
