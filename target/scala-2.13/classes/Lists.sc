val a = List(1, 2, 3)
val b = List(1, 2, 3)

a == b
a eq b
a eq a

val c: List[String] = Nil
val d: List[Int] = Nil

d == Nil

c eq Nil

c == d

c eq d

val a1 = List(1, 3, 5, 7, 9)
a1(0)
a1(2)
a1(4)

val e = List(1, 3, 5, 7, 9)

e.filter( _ != 5)
e.filterNot(_ == 5)

e.filter { v =>
  v % 3 == 0
}
e.map(_*2)

val f = List(1, 3, 5, 7)

val g = List(1, 3, 5, 7)
g.reduceLeft(_ + _)
g.reduceRight(_ * _)
g.fold(0)(_ + _)

val h = (1 to 5).toList
val h2 = (1 until 5).toList