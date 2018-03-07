println( 3.isInstanceOf[Int] )
println( 3.isInstanceOf[Char] )

val g:Any = "this is a string"
// val h:String = g <<< does not compile
val h:String = g.asInstanceOf[String]

def decide(x:Any) = if (x.isInstanceOf[Int]) x.asInstanceOf[Int] + 1 else -1

println(decide(4))
println(decide(4.0))

def decidePoorly(x:Any) = x.asInstanceOf[Int] + 10
println(decidePoorly(4))
//println(decidePoorly("Zing")) << raises java.lang.ClassCastException

