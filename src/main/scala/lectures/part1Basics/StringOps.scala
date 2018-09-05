package lectures.part1Basics

object StringOps extends App {

  val str: String = "Hello I am learning Scala"

  println(str.charAt(2))
  println(str.split(" ").toList)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  //Prepending and appending
  println('a' +: aNumberString :+ 'z') //a2z
  println(str.reverse)
  println(str.take(2)) //He

  //Scala-specific: Scala interpolators
  //S-interpolators

  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val agGreeting = s"Hello, my name is $name and I am turning ${age + 1} years old"

  //F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  //raw-interpolator
  println(raw"this is a ")


}

