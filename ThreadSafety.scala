object ThreadSafety extends App {
  var domain: String = ""

  def setDomain(input : String) : Unit = synchronized {
    // yes you can do this in 1 line, but this is just an example
    domain = input.toLowerCase
    domain = domain.split("@")(1)
  }

  def getDomain: String = synchronized { domain }

  setDomain("foo@bar.com")
  println(getDomain)
}
