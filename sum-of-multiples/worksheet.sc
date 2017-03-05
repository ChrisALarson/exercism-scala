val limit = 25

val factors = List(3,5)

  def getMultiples(multiples: List[Int]): List[Int] = {
    if (multiples.head + multiples.last >= limit) multiples
    else getMultiples(multiples.last + multiples.head :: multiples)
  }



factors.foreach()