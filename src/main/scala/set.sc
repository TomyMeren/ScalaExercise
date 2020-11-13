val a = Set("aaa","bb",4)
a(2)

val b = List("aaa","bb",4)
a(3)
a.apply(4)

Set("Michigan", "Ohio", "Wisconsin", "Michigan")

a - 4
//b - 4 Error
a -- Set("aaa","bb")

a -5

val c = Set("aaa","cc",5)

a intersect c

a union c

val d:Set[Any] = Set("bb")

d subsetOf(a)
d subsetOf(c)

a diff c
c diff a

val e = Set("bb",4,"aaa")

a equals(e)
a.toList equals(e.toList)

List(1,2,3) equals(List(1,3,2))
