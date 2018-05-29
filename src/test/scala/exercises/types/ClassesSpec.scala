package exercises.types

import exercises.types.classes.Person
import org.scalatest._

class ClassesSpec extends FlatSpec with Matchers{

  "Person " should "provide proper summary" in {

    val jose = Person(name = "Jose", age=37)
  }

}
