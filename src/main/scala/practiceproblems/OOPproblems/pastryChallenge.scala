package practiceproblems.OOPproblems

/*
-Use an abstract class to model a Donut Pastry with
    -name of type String
    -printName() method with no return type
-Define two sub-classes of the Donut
    -VanillaDonut
    -GlazedDonut
-Create a class that accepts an upper type bound for a Donut type as its constructor argument
    -This class has a name() method that calls a Pastry's printName() method
        -which is derived from the upper type bound constraint applied to the Pastry's constructor argument
-Create two instances of Pastry
    -one with upper type bound constraint of VanillaDonut
    -one bound to the abstract Donut type
-This will have to respectively pass through corresponding objects
    -a VanillaDonut and GlazedDonut
    -to the two Pastry instances, and thereafter call the Pastry's name() method


* */



abstract class Pastry(name:String) {

  def printName()
}

object PastryChallenge extends App {

}


