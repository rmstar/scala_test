object Lists extends App {

  val a = List(1,2,3,4,5)
  // equivalent to above
  val a2 = List.apply(1,2,3,4,5)
  // Using right associative colon
  val a3 = 1 ::2 ::3 :: 4 :: 5 :: Nil

  println(a.head) //1
  println(a.tail) //2,3,4,5
  println(a.init) //1,2,3,4
  println(a.last) //5

  println(a.apply(3)) //4
  println(a.min)
  println(a.max)
  println(a.isEmpty)
  println(a.nonEmpty)
  println(a.updated(3, 100)) //Underused. update index 3 element with 100

  println(a.mkString(","))
  println(a.mkString("**"))
  println(a.mkString("[", "**", "]"))
}
