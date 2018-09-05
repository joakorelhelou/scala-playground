package lectures.part2oop

object CaseClasses extends App {

  case class Person(name: String, age: Int)

  //1. case parameters are fields
  val jim = new Person("jim", 34)
  println(jim.name)

  //2. Sensible to String
  println(jim.toString) //Person(Jim,34)

  //3. equals and hashcode implemented OOB
  val jim2 = Person("jim", 34)
  println(jim == jim2) //true

  //4. CCs have handy copy methods
  val jim3 = jim.copy() //Create new instance of the case class
  val jim4 = jim.copy(age = 56) // New instance with the age changed

  //5. CCs have companion objects
  val thePerson = Person
  val mary = Person("Mary", 23) //delegates to apply() which acts as a constructor

  //6. CCs are serializable

  //7. CCs have extractor patterns and can be used in Pattern Matching

  // case object dont have companion objects
  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }
}
