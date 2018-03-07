object ForEach extends App {
  val a = 1 to 10
  //a.foreach(x => println(x))
  //a.foreach(println(_))
  //a.foreach(println _)
  //a.foreach(println )
  a foreach println
  // NOTE: foreach is a method that takes a function that takes each element and returns a Unit
  // Good for cases where you want to take each element and perform a side effect like println()
}
