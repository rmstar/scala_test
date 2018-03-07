object MyObject {
  val f = (x:Int) => x + 1
  def g(x:Int) = x + 1
}

object MethodOrFunction extends App {
  // method != function
  // function are their own objects. can use apply on functions
  // methods belong to a context (class, abstract class, trait etc)
  println(MyObject.f.apply(4))
  println(MyObject.f(4))
  println(MyObject.g(4))
}
