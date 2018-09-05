package lectures.part2oop

object InheritanceAndTraits extends App {

  class Animal {
    val creatureType = "wild"
    def eat = println("nomnom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunchcrunch")
    }
  }

  val cat = new Cat
  cat.crunch

  //constructor
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  sealed class Adult(name: String, age: Int, idCard: String) extends Person(name)

  //overriding
  class Dog(override val creatureType: String) extends Animal {
    //override val creatureType: String = "domestic"
    override def eat: Unit = {
      super.eat
      println("Crunch, crunch")
    }
  }

  val dog = new Dog("domestic")
  dog.eat
  println(dog.creatureType)

  //Time substitution (polymorhism)
  val unknownAnimal:Animal = new Dog("K9")
  unknownAnimal.eat

  //super
  //prevent overrides using final on the member or in the class or sealing the class( we can extend the class in this FILE)
}
