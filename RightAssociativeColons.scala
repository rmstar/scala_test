package com.oreilly.scala

object RightAssociativeColons extends App {
    class Foo(x:Int) {
        def ~:(y:Int) = x + y
    }
    
    val foo = new Foo(10)
    println(foo.~:(5))
    println(5 ~: foo) //Right Associative Colon
    // Right associativity is used for List and Stream operations
}
