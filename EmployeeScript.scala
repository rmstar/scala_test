val ada = new Employee("Ada", "Lovelace")
println(ada.firstName)
val newAda = ada.copy(lastName = "Byron, Countess of Lovelace")
println(newAda.lastName)
println(newAda.title)

val dennis = new Employee(lastName="Ritchie", firstName="Dennis")
println(s"The first name is ${dennis.firstName}")
println(s"The last name is ${dennis.lastName}")

println(ada.fullName)
println(dennis.fullName)

try {
    new Employee("Bono", "", "Singer")
} catch {
    case iae:IllegalArgumentException => println(iae.getMessage)
} finally {
    println("Continuing with program")
}

try {
    new Employee("Linus", "Torvalds", "Senior C Programmer")
} catch {
    case iae:IllegalArgumentException => println(iae.getMessage)
} finally {
    println("Continuing with program")
}

val mathematics = new Department("Mathematics")
// :Manager is inferred
val alan:Manager = new Manager("Alan", "Turing", "Mathematician", mathematics)
println(alan.department.name)

val alanEmployee:Employee = alan
//error: value department is not a member of Employee
//println(alanEmployee.department.name)

def extractFirstName(e:Employee) = e.firstName
println(extractFirstName(ada))
println(extractFirstName(dennis))
println(extractFirstName(alan))

println(alan.fullName)
println(alanEmployee.fullName)

val alanNewJob = alan.copy(title="Supreme Encryption Specialist")
println(alanNewJob.title)
println(alanNewJob.department.name)

val anotherAda = new Employee("Ada", "Byron, Countess of Lovelace", "Programmer")
println(newAda == anotherAda) // true
println(newAda != anotherAda) // false

println(newAda eq anotherAda) // false. pointing to different objects
val evenAnotherAda = anotherAda
println(anotherAda eq evenAnotherAda) // true
println(newAda.hashCode == anotherAda.hashCode) // true
println(ada.hashCode != anotherAda.hashCode) // true
println(newAda)

// new keyword is optional for case classes
val toys = Department("Toys")
println(toys)
val toys2 = Department("Toys")
println(toys == toys2) // true
println(toys.hashCode == toys2.hashCode) // true
val hardware = toys.copy(name="Hardware")
println(hardware)

val name = toys match {
    case Department(n) => n
    // _ is default
    case _ => "Unknown"
}
println(name)

// equivalent to above : pattern matching is provided for free by case class
// NOTE: case classes can't be subclassed
val Department(name2) = toys
println(name2)

val alanPerson:Person = alan
val adaPerson:Person = newAda
