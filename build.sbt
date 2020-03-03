name := "graal_try"

organization := "tech.bilal"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
//  Akka.`akka-actor-typed`,
//  Akka.`akka-streams`,
//  AkkaHttp.`akka-http`,
  Borer.`borer-core`,
  Borer.`borer-derivation`,
  Libs.`os-lib`
//  Borer.`borer-compat-akka`,
//  Libs.enumeratum,
//  Libs.`pure-config`
)
