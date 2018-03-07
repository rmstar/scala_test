object FunctionsWithFunctions extends App {
  val f  = (x:Int, y:Int => Int) => y(x)
  println(f(3, (m:Int) => m + 1)) //4
  println(f(3, m => m + 1)) //4
  println(f(3, _ + 1)) //4
  println(f(3, 1 + _)) //4
  // remove _ because it's last arg
  // warning: postfix operator + should be enabled by making the implicit value scala.language.postfixOps visible.
  //println(f(3, 1 +)) //4
  import scala.language.postfixOps
  println(f(3, 1 +)) //4

  // return function from function
  val g = (x:Int) => (y:Int) => x + y
  println(g.apply(4).apply(5))
  println(g(4)(5))
  // Higher order function: term used to describe function that takes functions as param, (or) method that takes function as param
  // functions can return functions - useful for applying function in parts

}
