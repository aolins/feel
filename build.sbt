ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "camunda"
  )

resolvers += Resolver.sonatypeRepo("releases")
resolvers += Resolver.typesafeIvyRepo("releases")
resolvers += Resolver.bintrayRepo("typesafe", "maven-releases")

libraryDependencies ++= Seq( // Prometheus
  "org.camunda.feel" % "feel-engine" % "1.16.0"
)