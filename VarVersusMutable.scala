import scala.collection.mutable
object VarVersusMutable extends App {
    val mutableList = mutable.ListBuffer[String]()
    var immutableList = List[String]()

    def createString(f: String => Unit): Unit = {
        f("This")
        f("is")
        f("Scala")
        f("with")
        f("mutability")
    }

    def appendFunction1(input : String) : Unit = {
        mutableList += input
    }

    createString(appendFunction1)
    println(mutableList)

    def appendFunction2(input: String): Unit = {
        immutableList :+= input
        //equivalent to:
        //immutableList = immutableList :+ input
    }

    createString(appendFunction2)
    println(immutableList)

    def removeFunction1(input: String): Unit = {
        mutableList -= input
    }
    removeFunction1("mutability")
    println(mutableList)

    def removeFunction2(input: String): Unit = {
        immutableList = immutableList.filterNot(_ == input)
    }
    removeFunction2("mutability")
    println(immutableList)

}
