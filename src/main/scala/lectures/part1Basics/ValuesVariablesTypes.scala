package lectures.part1Basics

object ValuesVariablesTypes extends App {

  //Create a value
  val x: Int = 42
  println(x)

  // val cannot be reasigned, val is immutable like finals
  // x = 2 -> Error

  //Typing can be omitted, types are inferred
  val y = 34

  val aString: String = "hello"
  val anotherString: String = "goodbye"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 456
  val aLong: Long = 546464646654657498L
  val aFloat: Float = 2.0f //Needs f at the end or will be treated as a double.
  val aDouble: Double = 3.14

  // variables (mutable)
  var aVariable: Int = 4
  aVariable = 5

  // In functional programming we work more with values and not variables
}
