import scala.util.{Try, Success, Failure}

val s1 = "123"
val v1 = Try { s1.toInt}
v1 match {
  case Success(n) => println(n)
  case Failure(ex) => println(ex.getMessage)
}

val s2 = "1a23"
val v2 = Try { s2.toInt}
v2 match {
  case Success(n) => println(n)
  case Failure(ex) => println(ex.getMessage)
}

val s3 = "123"
val s4 = "456a"
val result = for {
  n <- Try { s3.toInt }
  m <- Try { s4.toInt }
} yield n+m
println(result)

