val t = Map("xxxx" -> 24, "yyy" -> 25, "zz" -> 26)
val it = t.keysIterator
it.next()
it.next()

val it2 = it.map(_.length)

it2.next()
//it2.next()
val it3 = t.keysIterator

it3.dropWhile(_.length > 3)
it3.next()


val (words, ns) = Iterator("a", "number", "of", "words").duplicate

val shorts = words.filter(_.length < 3).toList

//Es lazy

val a = (1 to 10).iterator.map(println)
a.toList

(1 to 10).iterator.map(println).take(5).toList

val it4 = Iterator(1, 2, 3, 4)

val bit = it4.buffered

bit.head
bit.next()
bit.next()
bit.headOption

val it5 = Iterator(1, 2, 3, 4)
it5.span(_ == 0)._2.toList

/*
def collapse(it: Iterator[Int]) =
  if (!it.hasNext) Iterator.empty else {
  var head = it.next
  val rest = if (head == 0) it.dropWhile(_ == 0) else it
  Iterator.single(head) ++ rest
}
*/

List(0,0,0,1,2,4).span(_ == 0)
List(1,0,2,4).span(_ == 0)