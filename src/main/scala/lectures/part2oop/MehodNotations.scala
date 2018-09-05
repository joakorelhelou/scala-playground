package lectures.part2oop

object MehodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangoutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)

    //We need to put an space
    def unary_! : String = s"$name, what the heck?!"

    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"

    def learns(thing: String): String = s"$name is learning $thing"

    def learnsScala: String = this learns "scala"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  //Equivalent to
  println(mary likes "Inception")
  //Infix notation = operator notation (syntactic sugar)

  //"Operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  // hangoutWith is an operator (like + - / & (not reserved))
  println(mary hangoutWith tom)
  println(mary + tom)

  println(1 + 2) //Equivalent to
  println(1.+(2))

  //Prefix notation
  val x = -1 //equivalent to
  val y = 1.unary_-
  // unary_ prefix olny works with - + ~ !
  print(!mary)
  println(mary.unary_!)

  //postfix notation
  println(mary.isAlive)
  //Not really used because can lead to ambiguities
  println(mary isAlive)

  //apply method
  println(mary.apply())
  println(mary()) //Equivalent. () calls apply

  println((mary + "the rockstar") ())

  println(s"Age is ${(+mary).age}")

  println(mary learnsScala)
  println(mary learns "java")
  println(mary(10))
}