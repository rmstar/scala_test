val coupleIntString = new Couple(10, "Scala") //Couple[Int,String]
val coupleIntString2:Couple[Int,String] = new Couple(10, "Scala") //Couple[Int,String]
val coupleStringString = Couple("One", "String") //Couple[String,String]
val coupleStringCoupleIntDouble = Couple("Hello", Couple(3, 22.2)) //Couple(String, Couple[Int, Double])
println(coupleStringCoupleIntDouble.second.first)

val employeeCouple = Couple(new Employee("John", "McCarthy"),
                            new Employee("Guido", "van Rossum"))
println(employeeCouple)
println(employeeCouple.swap)
