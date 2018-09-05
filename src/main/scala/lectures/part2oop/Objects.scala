package lectures.part2oop

object Objects {

  //Scala does not have class level functionality ("statics")
  object Person { //Defines type and only instance
    val N_EYES = 2

    def canFly: Boolean = false

    //factory method
    def apply(mother: Person, father: Person): Person = new Person("Boobie")
  }

  class Person(val name: String) {
    //Companions (they reside in the same scope and have the same name
    //Instance level functionality
  }

  //Scala applications -> Scala object with a def main method. if we extend App code is runnable
  def main(args: Array[String]): Unit = {
    println(Person.N_EYES)
    println(Person.canFly)

    //Scala object = Singleton instance
    val mary = Person
    val john = Person
    println(mary == john) //true

    val mary2 = new Person("mary")
    val john2 = new Person("john")
    println(mary2 == john2) // false

    val bobbie = Person(mary2, john2)

  }


}
