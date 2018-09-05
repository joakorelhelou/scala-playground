package lectures.part3functional

object WhatsAFunction extends App {
  //Learn to use functions as first class elements
  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  //We can call doubler as if it was a function.
  println(doubler(2))

  //function types = Function 1[A,B]
  val stringToIntConverter = new Function1[String, Int] {
    override def apply(v1: String): Int = v1.toInt
  }

  println(stringToIntConverter("3") + 4)

  ///Third type is the return type
  val adder = new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }

  // Functions types Function2[A,B,R] == (A,B) => R
  // All scala functions are objects

  def concatenator: (String, String) => String = (v1: String, v2: String) => v1 + v2

  // Function1[int, function1[int,int]]
  val superAdder: Function1[Int, Function1[Int,Int]] = new Function1[Int, Function1[Int,Int]]{
    override def apply(x: Int): Int => Int = new Function1[Int,Int] {
      override def apply(y: Int): Int = x + y
    }
  }

  //Super short form
  val superAdder2: Int => Int => Int = (x: Int) => (y: Int) => x + y

  val adder3 = superAdder(3)
  println(adder3(4)) //7
  println(superAdder2(3)(4))

}

//We need to instantiate this class to call excecute
trait Action[A, B] {
  def execute(element: A): B = ???
}

trait MyFunction[A, B] {
  def apply(element: A): B = ???
}