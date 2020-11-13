val t = Map("x" -> 24, "y" -> 25, "z" -> 26)

t.apply("x")
t.get("x")
t.getOrElse("x", 0)
t.getOrElse("f", 0)
t.contains("x")
t.isDefinedAt("g")

t("z")

t + ("t" -> 27)
t ++ Map("t" -> 27)
t updated("x", 23)
t - "x"
t -- List("x")

t.keys
t.keySet
t.keysIterator
t.values
val it = t.valuesIterator
it.next()
it.next()

t + ("x" -> 23)

val myMap = Map("Ann Arbor" -> "MI", 49931 -> "MI")

val myMap2 = Map("MI" -> "Michigan", "OH" -> "Ohio", "WI" -> "Wisconsin", "IA" -> "Iowa")
val myMap3 = myMap2 withDefaultValue "missing data"

//myMap2("tomy")
myMap3("tomy")