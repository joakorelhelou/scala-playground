package lectures.part2oop

object OOBassics extends App {
  val person = new Person("John", 26)
  println(person.age)
  person.greet("Daniel")
  person.greet()

  val author = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}

//Constructor
class Person(name: String, val age: Int) {
  //Class parameters are not fields, cannot be accessed from outside. We need to add val

  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  //Overloading
  def greet(): Unit = println(s"Hi, I am ${this.name}")

  //Overloading constructors. Can only call another constructor
  def this(name: String) = this(name, 0)
}

class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge: Int = year - author.year

  def isWrittenBy(author: Writer): Boolean = author == this.author

  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1) //ensures immutability - important in functional programming
  }

  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }

  def print = println(count)
}