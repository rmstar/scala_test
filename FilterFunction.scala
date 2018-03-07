object FilterFunction extends App {
    val a = 1 to 10
    println(a.filter(_ %2 == 0)) //Filter even numbers
    println(a.filterNot(_ %2 == 0)) //Filter odd numbers
    println(a.exists(_ %2 == 0)) //Does it have event numbers

    def filterVowels(s:String) = s.toLowerCase.filter(c => Set('a','e','i','o','u').contains(c))
    println(filterVowels("Orange"))

    val b = Set("Red", "Blue", "Green", "Purple", "Orange")
    println(b.filter(filterVowels(_).size > 1))

    val m = Map(1 -> "One", 2 -> "Two", 3 -> "Three", 4 -> "Four")
    println(m.filterKeys(_ % 2 == 0)) // returns a map with (k,v) where keys match predicate

    println(Some(5).filter(_ % 2 == 0))
    println(Some(4).filter(_ % 2 == 0))
}
