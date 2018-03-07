import scala.beans.BeanProperty

abstract class Person {
    def firstName:String
    def lastName:String
}

class Employee(@BeanProperty val firstName:String,
               @BeanProperty val lastName:String,
               val title:String="Programmer") extends Person {
    require(firstName.nonEmpty, "First Name cannot be empty")
    require(lastName.nonEmpty, "Last Name cannot be empty")
    require(title.nonEmpty, "Title cannot be empty")

    if (title.contains("Senior") || title.contains("Junior"))
        throw new IllegalArgumentException("Title cannot contain Senior or Junior")

    // typical form
    //def this(firstName:String, lastName:String) = this(firstName, lastName, "Programmer")

    // Atypical form
    //def this(firstName:String, lastName:String) = {this(firstName, lastName, "Programmer")}

    // Atypical form with side effect
    //def this(firstName:String, lastName:String) = {this(firstName, lastName, "Programmer"); println("Side effect")}

    // Atypical form with side effect multi-line
    //def this(firstName:String, lastName:String) = {this(firstName, lastName, "Programmer")
    //                                               println("Side effect")}

    def fullName = s"$firstName $lastName"

    def copy(firstName:String = this.firstName, lastName:String = this.lastName,
             title:String = this.title) = {
        new Employee(firstName, lastName, title)
    }

    override def equals(x:Any):Boolean = {
        if (!x.isInstanceOf[Employee]) false
        else {
            val other = x.asInstanceOf[Employee]
            other.firstName == this.firstName &&
            other.lastName == this.lastName &&
            other.title == this.title
        }
    }

    override def hashCode:Int = {
        var result = 19
        result = 31 * result + firstName.hashCode
        result = 31 * result + lastName.hashCode
        result = 31 * result + title.hashCode
        result
    }

    override def toString = s"Employee($firstName, $lastName, $title)"
}

// val is implicit for case classes
case class Department(name:String) {
    override def toString = s"Department: $name"
}

// as department is a val, it gets an accessor
class Manager(firstName:String, lastName:String, title:String, val department:Department) extends Employee(firstName, lastName, title) {

    override def fullName = s"$firstName $lastName, ${department.name} Manager"

    override def copy(firstName:String = this.firstName, lastName:String = this.lastName,
             title:String = this.title) = {
        new Manager(firstName, lastName, title, Department("Toys"))
    }

    // fails to compile: error: in class Manager, multiple overloaded alternatives of method copy define default arguments (class Manager and class Employee)
    /*def copy(firstName:String = this.firstName, lastName:String = this.lastName,
             title:String = this.title, department:Department = this.department) = {
        new Manager(firstName, lastName, title, department)
    }*/
}
