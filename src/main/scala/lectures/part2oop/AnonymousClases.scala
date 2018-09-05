package lectures.part2oop

object AnonymousClases extends App {

  abstract class Animal {
    def eat: Unit
  }

  //anonymous class. The compilers creates a class "AnonymousClases$$anon$1" extending Animal
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("ahahahahah")
  }

  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is $name, how can I help?")
  }

  // We cannot instantiate an anonymous class without the parameters
  // Anonymous classes work for Abstract classes and non abstract classes
  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"Hi, my name is Jim, how can I be of service?")
  }

}
