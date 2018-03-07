object Functions extends App {
    val f1:Int => Int = (x:Int) =>x + 1

    // param and return type are deduced
    val f0 = () => 1

    // equivalent to below:
    //val f2:Function2[Int, String, String] = new Function2[Int, String, String] {
    //    def apply(x:Int, y:String) = y + x
    //}
    val f2 = (x:Int, y:String) => y + x

    println(f1(3))
    println(f0())
    println(f2(3, "Wow"))

    val f3 = (x:String) => (x, x.size)
    println(f3("Laser"))
}
