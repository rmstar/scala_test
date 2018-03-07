object ByNameParameters extends App {
    def byValue(x:Int)(y:Int) = { println("By Value:"); x + y}

    def byFunction(x:Int)(y: () => Int) = { println("By Function:"); x + y()}

    // By Name Params are params that can be called as a block and lazily evaluated
    // Useful for catching exceptions and cleaning up resources (see example at end)
    def byName(x:Int)(y: => Int) = {println("By Name:"); x + y}

    // eager eval
    val a = byValue(3){
                println("In call")
                19
            }

    // lazy eval
    val b = byFunction(3)( () => {println("In call"); 19})

    // lazy, but better syntax like byValue
    val c = byName(3){
                println("In call")
                19
            }
    

    def divideSafely(f: => Int):Option[Int] = {
      try {
        Some(f)
      } catch {
        case ae:ArithmeticException => None
      }
    }

    val d = divideSafely {
      val x = 10
      val y = 5
      x /y
    }
    println(d)

    val e = divideSafely {
      val x = 1000
      val y = 0
      x / y
    }
    println(e)
}
