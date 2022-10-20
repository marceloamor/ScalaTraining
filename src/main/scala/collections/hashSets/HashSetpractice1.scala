package collections.hashSets

import scala.collection.immutable.HashSet


object HashSetpractice1 extends App {
    var hashSet = HashSet(23,5,3,8,0,6,5)
    //hashSet.foreach((element:Int) => println(element))

    var pointer = 0
    hashSet.foreach((element:Int) => {

        var newElem = element + element/2
        println(newElem)

    })


}
