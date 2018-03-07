def processNumbers(b:Boolean, x:Int, y:Int) = if (b) x else y
println(processNumbers(x = 10, y = 41, b = true))


def add(x:Int, y:Int = 10) = x + y
def sub(x:Int=10, y:Int) = x - y
println(add(4,3))
println(add(30))
println(sub(y=10))
