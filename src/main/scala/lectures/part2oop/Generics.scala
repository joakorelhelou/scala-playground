package lectures.part2oop

object Generics extends App {

  class MyList[+A] {
    //use the type A inside the class def
    def add[B >: A](element: B): MyList[B] = ???
  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //Generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

  //variance problem
  class Animal

  class Cat extends Animal

  class Dog extends Animal

  //1 . List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]

  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  //animalList.add(new Dog) ?? Hard question => we return a list of animals

  //2 . NO = INVARIANCE
  class InvariantList[A]

  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  //3 . Hell, no! CONTRAVARIANCE
  class ContravariantList[-A]

  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]

  class Trainer[-A]

  val trainer: Trainer[Cat] = new Trainer[Animal]

  //bounded types.. only subtypes of animal
  class Cage[A <: Animal](animal: A)

  val cage = new Cage(new Dog)


}
