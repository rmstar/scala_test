object Maps extends App {
    val m = Map.apply((1, "One"), (2, "Two"), (3, "Three"))
    val m2 = Map((1, "One"), (2, "Two"), (3, "Three"))

    val t:(Int, String) = 3 -> "Three" // -> converts into tuple (3, "Three")
    println(t)

    val m3 = Map(1 -> "One", 2 -> "Two", 3 -> "Three")

    println(m3.get(1)) //Some("One")
    println(m3.apply(1)) // "One"
    println(m3(1)) //Some("One")
    println(m3.get(4)) //None
    //println(m3(4)) //java.util.NoSuchElementException

    println(m3.toList)
    println(m3.keys) //Set(1,2,3)
    println(m3.keySet) //Set(1,2,3)
    println(m3.values) //MapLike("One", "Two", "Three")
    println(m3.values.toList)

    val s = new String("Co")
    val s2 = "Co" //interned (created in a common pool)
    println(s == s2) //true
    println(s eq s2) //false

    val co = Symbol("Co") // Symbols are like Strings, but are interned
    val co2 = 'Co // ' prefix means it's a symbol
    println(co == co2) //true
    println(co eq co2) //true

    val elements:Map[Symbol, String] = Map('Co -> "Cobalt",
                                           'He -> "Helium",
                                           'Pb -> "Lead")
    println(elements.get('Co))
}
