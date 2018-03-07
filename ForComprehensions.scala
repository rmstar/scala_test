object ForComprehensions extends App {
  /*for (i <- 1 to 10) {
    println(i)
  }*/

  val result1  = for (i <- 1 to 10) yield (i + 1)
  println(result1)

  val result2 = (1 to 10).map(_ + 1)
  println(result2)

  val result3 = for(i <- Some(100)) yield (i + 40)
  println(result3)

  val result4 = Some(100).map(i => i + 40)
  println(result4)

  val result5 = for(i <- List(1,2,3,4); 
                    j <- List(5,6,7,8)) yield (i,j)
  println(result5) // result like nested for loop

  val result6 = List(1,2,3,4).flatMap(i => List(5,6,7,8).map(j => (i,j)))
  println(result6)

  val result7 = for (i <- List(1,2,3,4)
                     if (i % 2) == 0;
                     j <- List(5,6,7,8)) yield (i,j)
  println(result7)

  val result8 = for (i <- List(1,2,3,4);
                     j <- List(5,6,7,8)
                     if (j < 7)) yield (i,j)
  println(result8)

  // rewriting result7
  // withFilter is a lazy version of filter
  val result9 = List(1,2,3,4)
                .withFilter(i => i % 2 == 0)
                .flatMap(i => List(5,6,7,8)
                .map(j => (i,j)))
  println(result9)
  // rewriting result8
  val result10 = List(1,2,3,4)
                 .flatMap(i => List(5,6,7,8)
                 .withFilter(_ < 7)
                 .map(j => (i,j)))
  println(result10)

  // for comprehensions are just map, flatMap, withFilter and foreach behind the scenes.
  // they return collections like List, Set, Option etc
  // Any object with map, flatMap, withFilter/filter and foreach (i.e. monadic) can be used in for comprehension
}
