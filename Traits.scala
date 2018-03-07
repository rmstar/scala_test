object Traits extends App {
  trait NamedCreature {
    def getName(): String
  }

  trait Sound {
    def beep(): String
  }

  trait Animal {
    def getNameTag(id: Int): String
  }

  class Dog(val name: String) extends Animal with NamedCreature with Sound {
    val beep = "woof"
    val getName = name
    override def getNameTag(id: Int) = s"${name}:$id"
  }

  def printNameTag(animal: Animal, id:Int): Unit = {
    val tag = animal.getNameTag(id)
    println(s"Name Tag: $tag")
  }

  val dog = new Dog("pet")
  println(dog.beep)
  println(dog.getName)
  //println(dog getNameTag 10)
  printNameTag(dog, 10)

  val gordo = new NamedCreature() with Sound {
    override def getName = "gordo"
    val beep = "wowowow"
  }
  println(gordo.getName)
  println(gordo.beep)
}
