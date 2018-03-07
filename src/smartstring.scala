val lyrics = """This is
                |a muli line
                |string here""".stripMargin
println(lyrics)
val message = "We are meeting at 12:30PM on June 30th"
val regex = """(\s[0-9])?[0-9]:[0-5][0-9]\s*(AM|PM)""".r
println(regex.findAllIn(message).toList)
