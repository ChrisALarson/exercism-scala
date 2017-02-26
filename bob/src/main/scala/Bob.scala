/**
  * Created by Chris on 2/26/17.
  */
import scala.util.matching.Regex

class Bob {


  def hey(sentence:String):String = {


    val MyPattern = "[^a-zA-Z]+".r  //contains no characters

    sentence match {
      case a if {a.matches("[\\s]*".r.toString)} => "Fine. Be that way!"
      case b if {b.toUpperCase == sentence && !b.matches(MyPattern.toString)} => "Whoa, chill out!"
      case c if {c.matches(MyPattern.toString) && !c.endsWith("?")} => "Whatever."
      case d if {d.endsWith("?")} => "Sure."
      case _ => "Whatever."
    }
  }

}
