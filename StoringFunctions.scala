object StoringFunctions extends App {
  val strings = List("where", "the", "wild", "things", "are")
  val filters: List[String=>Boolean] = List(_.contains("a"),
                                            _.contains("b"),
                                            _.length % 2 == 0)

  def filter(input: List[String]): List[String] = {
    filters.foldLeft(input)((i,f) => i.filterNot(f))
  }
  println(filter(strings))
}
