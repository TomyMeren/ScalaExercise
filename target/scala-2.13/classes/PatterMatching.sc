val foodItem = "porridge"

def goldilocks(expr: (String, String)) = expr match {
  case (`foodItem`, _) => "eating"
  case ("chair", "Mama") => "sitting"
  case ("bed", "Baby") => "sleeping"
  case _ => "what?"
}

goldilocks(("porridge", "Papa"))

def patternEquals(i: Int, j: Int) = j match {
  case `i` => true
  case _ => false
}
patternEquals(3, 3)

val secondElement = List(1, 2, 3) match {
  case x :: y :: xs :: Nil => y
  case _ => 0
}

val r = List(1, 2, 3) match {
  case x :: y :: Nil => y // only matches a list with exactly two items
  case _ => 0
}