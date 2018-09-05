package lectures.part3functional

object HODsCurries extends App {

  //High order functions
  val superFunction: (Int, (String, (Int => Boolean)) => Int) => (Int => Int) = null

  //function that applies a function n times over a value x
  //nTimes(f, n, x)
  //nTimes(f,3,x) = 3 times aplpications of f over x f(f(f(x)))
  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else nTimes(f, n - 1, f(x))

  val plusOne = (x: Int) => x + 1
  println(nTimes(plusOne, 10, 1))

  //ntb(f,n) = x => f(f(f(x)))
  def nTimesBetter(f: Int => Int, n: Int): (Int => Int) =
    if (n <= 0) (x: Int) => x
    else (x: Int) => nTimesBetter(f, n - 1)(f(x))

  val plus10 = nTimesBetter(plusOne, 10)
  println(plus10(1))

  //curried functions
  val superAdder: Int => (Int => Int) = (x: Int) => (y: Int) => x + y
  val add3 = superAdder(3) // y => 3+y
  println(add3(10))

  def toCurry(f: (Int, Int) => Int): Int => Int => Int =
    x => y => f(x, y)

  def fromCurry(f: Int => Int => Int): (Int, Int) => Int =
    (x, y) => f(x)(y)

  def compose[A, B, T](f: A => B, g: T => A): T => B =
    x => f(g(x))

  def andThen[A, B, C](f: A => B, g: B => C): A => C =
    x => g(f(x))

  def superAdder2: Int => Int => Int = toCurry(_ + _)

  def add4 = superAdder2(4)

  println(add4(17))
}
