package practiceproblems.classChallenges

object groupTheAnagrams extends App {

  var strs = Array("eat","tea","tan","ate","nat","bat")

  //println(strs.groupBy(isAnagram(strs(0),_)))
  var strsGrouped: Map[Boolean, Array[String]] = strs.groupBy(isAnagram(strs(0),_))
  println(strsGrouped)  ///the above function is returning a map of true and false of anagram-ness w the first word in a strange style, but so close!!

  def isAnagram(a: String, b: String): Boolean = {

    var status = true

    if (a.length != b.length) {
      status = false
    } else {
      for (c <- a) {
        if (!(b contains c)) {
          status = false
        }
      }
    }
    status
  }


}
