import ScalaxbKeys._

organization := "com.example"

name := "scala-ofx"

scalaVersion := "2.11.1"

scalaxbSettings

packageName in scalaxb in Compile := "generated"

sourceGenerators in Compile <+= scalaxb in Compile

libraryDependencies += "net.databinder.dispatch" %% "dispatch-core" % "0.11.1"

libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.1"

libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.2"

dispatchVersion in scalaxb in Compile := "0.11.1"
