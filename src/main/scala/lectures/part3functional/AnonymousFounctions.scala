package lectures.part3functional

object AnonymousFounctions extends App {

  val baddouble = new Function[Int, Int] {
    override def apply(v1: Int): Int = v1 * 2
  }

  //Anonymous function (LAMBDA)
  val double = (x: Int) => x * 2

  // Declaring type
  //   val double: Int => Int = (x: Int) => x * 2
  //   val double: Int => Int = x => x * 2 compiler will know x's type

  val adder: (Int, Int) => Int = (a, b) => a + b

  //no params
  val justDoSomething: () => Int = () => 3

  println(justDoSomething) // class to string rep
  println(justDoSomething()) // 3. This is the function call

  //Curly braces
  val stringToInt = { (str: String) =>
    str.toInt
  }

  //More syntatctic sugar
  val niceIncrementer: Int => Int =  _ + 1 // equivalent to x => x+1
  val niceAdder: (Int, Int) => Int = _ + _  // equivalente to (a,b) => a + b
}
