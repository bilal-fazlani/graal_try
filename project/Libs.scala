import sbt._

object Libs {
  val enumeratum = "com.beachape" %% "enumeratum" % "1.5.15"
  val `pure-config` = "com.github.pureconfig" %% "pureconfig" % "0.12.3"
  val `os-lib` = "com.lihaoyi" %% "os-lib" % "0.6.3"
}

object Akka {
  private val Version = "2.6.3"
  val `akka-actor-typed` = "com.typesafe.akka" %% "akka-actor-typed" % Version
  val `akka-streams` = "com.typesafe.akka" %% "akka-stream" % Version
}

object AkkaHttp {
  private val Version = "10.1.11" //all akka is Apache License 2.0

  val `akka-http` = "com.typesafe.akka" %% "akka-http" % Version
}

object Borer {
  private val Version = "1.4.0"
  private val Org = "io.bullet"

  lazy val `borer-core` = Org %% "borer-core" % Version
  lazy val `borer-derivation` = Org %% "borer-derivation" % Version
  lazy val `borer-compat-akka` = Org %% "borer-compat-akka" % Version
}

//object Sttp {
//  object Client {
//    private val Org = "com.softwaremill.sttp.client"
//    private val Version = "2.0.0-RC13"
//    lazy val core = Org %% "core" % Version
//    lazy val `backend-zio` = Org %% "async-http-client-backend-zio" % Version
//  }
//  object Model {
//    private val Org = "com.softwaremill.sttp.model"
//    private val Version = "1.0.0-RC7"
//    lazy val core = Org %% "core" % Version
//  }
//}
//
//object Zio {
//  private val Org = "dev.zio"
//  lazy val zio = Org %% "zio" % "1.0.0-RC17"
//}
