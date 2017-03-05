import scala.collection.mutable.ArrayBuffer

object SumOfMultiples {

  def sumOfMultiples(factors: Set[Int], limit: Int): Int = {

    def getMultiples(multiples: List[Int]): List[Int] = {
      if (multiples.last > limit) List(0)
      else if (multiples.head + multiples.last >= limit) multiples
      else getMultiples(multiples.last + multiples.head :: multiples)
    }

    //new to scala: there's probably a much better way to do this!

    var multiplesArrays = ArrayBuffer[List[Int]]()
    var multiples = ArrayBuffer[Int]()

    for (i <- factors) {
      multiplesArrays += getMultiples(List(i))
    }

    for (x <- multiplesArrays) {
      for (z <- x) multiples += z
    }

    multiples.distinct.sum

  }



}

