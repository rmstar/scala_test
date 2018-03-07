case class Address(city: String, country: String)
case class Person(name: String, age: Int, address: Address)

val a1 = Address("London", "UK")
val a2 = Address("New York", "USA")

val p1 = Person("fred", 41, a1)
val p2 = Person("jane", 23, a2)

p1 match {
  case Person(n, a, _) if a > 30 => println(s"$n is older than 30")
  case Person(n, a, _) if a <= 30 => println(s"$n is a youngster")
}
p2 match {
  case Person(n, a, _) if a > 30 => println(s"$n is older than 30")
  case Person(n, a, _) if a <= 30 => println(s"$n is a youngster")
}
