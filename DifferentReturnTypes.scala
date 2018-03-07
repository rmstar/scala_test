def add(x:Int, y:Int) = {
    if (x > y) (x+y).toString
    else x + y
}
println(add(1, 10))
println(add(10, 1))
