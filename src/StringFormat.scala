val str = String.format("This is a %s", "Test")
println(str)

val str2 = "This is a %s".format("Test")
println(str2)

println("This is %3$s %2$s %1$s".format("one", "two", "three"))

import java.time._
println("We will be eating lunch on %1$tB the %1te in the year %1$tY".format(LocalDate.now))
printf("We will be eating lunch on %1$tB the %1te in the year %1$tY\n",  LocalDate.now)
