import scala.collection.mutable

object MutableDatastructures extends App {
    val mutableMap = new mutable.LinkedHashMap[Int, String]()

    def myMutableMap(): Unit = {
        mutableMap.put(1, "Foo")
        mutableMap.put(1, "Bar")
        mutableMap.put(2, "Baz")
    }
    println(mutableMap)
    myMutableMap()
    println(mutableMap)

    def myMutableMap2(): Unit = {
        mutableMap.remove(2)
    }
    myMutableMap2()
    println(mutableMap)
}
