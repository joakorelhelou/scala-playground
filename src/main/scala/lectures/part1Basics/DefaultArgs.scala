package lectures.part1Basics


object DefaultArgs extends App {

  def factorialHelper(x: Int, accumulator: BigInt = 1): BigInt =
    if (x <= 1) accumulator
    else factorialHelper(x - 1, x * accumulator) // Tail recursion: Use recursive as the last expression

  val fact10 = factorialHelper(10)

  def savePicture(width: Int, height: Int, format: String = "jpg"): Unit = println("saving picture")
  savePicture(800, 600)
}
