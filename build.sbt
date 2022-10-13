ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "newSBTProject"
  )

val scalaLogging="com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
val utilControl="org.scala-sbt" %% "util-control" % "1.7.2"
val reflect = "org.scala-lang" % "scala-reflect" % "2.13.10"
val xml = "org.scala-lang.modules" %% "scala-xml" % "2.1.0"



libraryDependencies ++=Seq(scalaLogging, utilControl, reflect, xml)


// https://mvnrepository.com/artifact/com.typesafe.scala-logging/scala-logging
//libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"

// https://mvnrepository.com/artifact/com.typesafe.scala-logging/scala-logging-slf4j
//libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2"
