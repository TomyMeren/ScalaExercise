def lambda: Int => Int = {
  x: Int => x + 1
}

def lambda2: Int => Int = (x: Int) => x + 2
///////////////////////////////////////////////////

def lambda3: Int => Int = new Function1[Int, Int] {
  def apply(v1: Int): Int = v1 - 1
}

def lambda4: Int => Int = (v1: Int) => v1 - 1

lambda3.isInstanceOf[Function1[Int, Int]]
//lambda3 == lambda4

def lambda5: (Int, Int) => Double = new Function2[Int, Int, Double] {
  def apply(x: Int, y: Int): Double = x / y
}

def lambda6: (Int, Int) => Double = new ((Int, Int) => Double) {
  def apply(x: Int, y: Int): Double = x / y
}

def lambda7: (Int, Int) => Double = (x: Int, y: Int) => x / y

//lambda5==lambda6 ==lambda7

val result1andhalf = lambda.apply(3)

var incrementer = 1
def closure = { x: Int =>
  x + incrementer
}

closure(10)

def closure2 = (x: Int) => x + incrementer

closure2(10)

def addWithoutSyntaxSugar(x: Int): Function1[Int, Int] = {
  new Function1[Int, Int]() {
    def apply(y: Int): Int = x + y
  }
}

def add(x:Int): Int => Int = (y:Int) => y + x

addWithoutSyntaxSugar(1).isInstanceOf[Function1[Int, Int]]
addWithoutSyntaxSugar(1).isInstanceOf[Int => Int]
addWithoutSyntaxSugar(1).isInstanceOf[Function1[Int, _]]
//trueaddWithoutSyntaxSugar(1).isInstanceOf[Int => Double] //Warning

4.isInstanceOf[Boolean]
4.isInstanceOf[Int]

def makeWhatEverYouLike(xs: List[String], sideEffect: String => String) =
  xs map sideEffect

makeWhatEverYouLike(List("a","b","c"), _.toUpperCase())
makeWhatEverYouLike(List("a","b","c"), x => x.toUpperCase())