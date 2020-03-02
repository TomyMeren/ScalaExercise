Some("I am wrapped in something")

def maybeItWillReturnSomething(flag: Boolean): Option[String] = {
  if (flag) Some("Found value") else None
}

val value1 = maybeItWillReturnSomething(true)
val value2 = maybeItWillReturnSomething(false)

value1.getOrElse("No value")
value2.getOrElse("No value")

val number: Option[Int] = Some(3)
//number * 1.5

number.map(_ * 1.5)

