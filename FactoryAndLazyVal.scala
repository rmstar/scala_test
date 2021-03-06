object FactoryAndLazyVal extends App {
  var jdbcURLFactory: Option[() => String] = None

  var usernameFactory: Option[() => String] = None

  var passwordFactory: Option[() => String] = None

  lazy val jdbcURL = jdbcURLFactory.getOrElse(() => "jdbc://mysql://localhost:3306")()
  lazy val username = usernameFactory.getOrElse(() => "root")()
  lazy val password = passwordFactory.getOrElse(() => "")()

  passwordFactory = Some(() => "tester")

  println(s"JDBC URL: $jdbcURL")
  println(s"Username: $username")
  println(s"Password: $password")

}
