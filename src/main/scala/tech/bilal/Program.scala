package tech.bilal

import io.bullet.borer.{Codec, Json}
import io.bullet.borer.derivation.MapBasedCodecs
import os.Path

case class Message(value: String)

object Program {

  def main(args: Array[String]): Unit = {
    printJson()
    printPaths(Array(os.pwd))
  }

  private def printJson(): Unit = {
    implicit val personCodec: Codec[Message] = MapBasedCodecs.deriveCodec
    val json = Json.encode(Message("hello-world")).toUtf8String
    println(json)
  }

  def printPaths(paths: Array[Path], level: Int = 0): Unit = {
    paths.foreach { path =>
      if (os.isDir(path)) {
        println(s"\n${" " * level}[${path.last}]")
        printPaths(os.list(path), level + 1)
      } else
        print(s"${" " * level}${path.last}:")
    }
  }
}
