package lectures.part1Basics

object Expressions extends App {

  val x = 1 + 2 // Expressions that are evaluated as a value
  println(x)
  println(2 + 3 * 4)

  // == != > >= < <=
  println(1 == x)

  // ! && ||
  println(!(1 == x))

  var aVariable = 2
  aVariable += 3 //also works with -= *= and /= (only in variables -> side effects)

  //Instructions (DO) vs Expressions (Value)

  // If expression, gives back a value
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)

  // NEVER USE WHILES OR LOOPS IN SCALA, IT IS IMPERATIVE PROGRAMMING
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  //EVERYTHING IN SCALA IS AN EXPRESSION
  //Only declarations are not expressions

  val aWeirdValue: Unit = (aVariable = 3) // aWeirdValue is an Unit that is like void
  println(aWeirdValue) //Prints (), which is the only value that Unit holds

  //Side effects: println(), whiles, reassigning -> side effects expressions that return Unit

  //Code Blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z < 2) "hello" else "goodbye"
  }

  //Code blocks are expresssions. The final value is the last value
  // Code blocks have scopes, its variables cannot be accessed form outside
}
