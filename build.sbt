ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

val AkkaVersion = "2.7.0"
val AlpakkaVersion = "5.0.0"

lazy val root = (project in file("."))
  .settings(
    name := "akka-stream-example",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
      "com.lightbend.akka" %% "akka-stream-alpakka-file" % AlpakkaVersion,
    )
  )
