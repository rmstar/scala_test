object FilterMapOverOptions extends App {

  def myFunction(input: Option[String]) : Boolean = {
    input.exists(_.trim.isEmpty)
  }

  def myFunction2(input: Option[String]) : Option[Int] = input match {
    case Some(in) if !in.trim.isEmpty => Some(in.length)
    case _ => None
  }

  def myFunction3(input: Option[String]) : Option[Int] = {
    // NOTE: map gets evaluated only if there's something inside the option,
    // but pattern match is always done
    input.filter(_.nonEmpty).map(_.length)
  }

  def myFunction4(input: Option[String]) : Option[String] = input match {
    case Some(in) => Some(in.toLowerCase)
    case _ => None
  }

  def myFunction5(input: Option[String]) : Option[String] = {
    // map returns None when option is empty
    input.map(_.toLowerCase)
  }


  println(myFunction(Some("")))
  println(myFunction(Some("Foo")))
  println(myFunction(None))

  println(myFunction2(Some("")))
  println(myFunction2(Some("Foo")))
  println(myFunction2(None))

  // prefer filter + map over pattern match here
  println(myFunction3(Some("")))
  println(myFunction3(Some("Foo")))
  println(myFunction3(None))

  println(myFunction4(Some("Hello World")))
  println(myFunction5(Some("Hello World")))
}
