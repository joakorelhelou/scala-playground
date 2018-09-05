package lectures.part2oop

object Exceptions extends App {

  val x: String = null
  //will crash with nullpointer exception println(x.length)
  // Throw an exception throw new NullPointerException

  val aWeirdValue = throw new NullPointerException

  def getInt(withExceptions: Boolean): Int = {
    if (withExceptions) throw new RuntimeException("No int for you")
    else 42
  }

  try {
    getInt(true)
  } catch {
    case e: RuntimeException => println("caught a runtime exception")
  } finally {
    println("Finally")
  }

  class OverflowException extends Exception

  class UnderflowException extends Exception

  object PocketCalculator {
    def add(x: Int, y: Int) {
      val result = x + y
      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if (x < 0 && y < 0 && result > 0) throw new UnderflowException
      else result
    }

  }

}
