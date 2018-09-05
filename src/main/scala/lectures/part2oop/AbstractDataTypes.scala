package lectures.part2oop

object AbstractDataTypes extends App {

  //abstract
  abstract class Animal {
    val creatureType: String

    def eat: Unit
  }

  class Dog extends Animal {
    val creatureType: String = "Canine"

    def eat: Unit = println("Crunch crunch")
  }

  //Traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"

    def eat: Unit =  println("nomnom")
    def eat(animal: Animal): Unit = println(s"I am a croc nd I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile

  croc.eat(dog)

    //Traits don't have constructor parametersa
  //Multiple treatis con be inherited by any class
  //Trats are behavior and not abstract things
}
