import java.time._

// protected => can be accessed from same package, and in subclasses. helps with testing
class Employee protected (val firstName:String, val lastName:String, val title:String, val hireDate:LocalDate)

object Employee {
    def apply(firstName:String, lastName:String, title:String) =
        new Employee(firstName, lastName, title, LocalDate.now)

    def apply(firstName:String, lastName:String, title:String, hireDate:LocalDate) =
        new Employee(firstName, lastName, title, hireDate)
}

case class Department(name:String)

object EmployeeDesignRunner extends App {
    val employee = Employee("Ken", "Thompson", "Programmer")
    println(employee.hireDate)

    val department = Department.apply("Sports")
    val department2 = Department("Sports")
    // case class automatically creates apply method on companion object
    println(department)
    println(department2)
}
