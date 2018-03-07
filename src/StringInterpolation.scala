val a = 9
println(s"${a + 3} is replaced")

val ticketCost = 50
val name = "spurs"
// $$ is to escape the $
println(f"The $name%s tickets are probably $$$ticketCost%1.2f")

val percentIncrease = 20
println(f"""The $name%s tickets are $$$ticketCost%1.2f
            |That's a $percentIncrease%% increase""".stripMargin)
