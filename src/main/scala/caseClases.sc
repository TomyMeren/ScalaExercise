abstract class Term
case class Var(name: String) extends Term
case class Fun(arg: String, body: Term) extends Term
case class App(f: Term, v: Term) extends Term

Fun("a",Fun("b",App(Var("c"),Var("d"))))

val a:Var = Var("Tomy")
a.name

val x1 = Var("x")
val x2 = Var("x")
val y1 = Var("y")
println("" + x1 + " == " + x2 + " => " + (x1 == x2))
println("" + x1 + " == " + y1 + " => " + (x1 == y1))

case class Person(first: String, last: String)

val p1 = Person("Fred", "Jones")
val p2 = Person("Shaggy", "Rogers")
val p3 = Person("Fred", "Jones")

p1.hashCode()
p3.hashCode()

p1.toString

case class Dog(var name: String, breed: String) // you can rename a dog, but change its breed? nah!
val d1 = Dog("Scooby", "Doberman")
d1
d1.name = "Scooby Doo"
d1

val d2 = d1.copy(name = "Pepe")
