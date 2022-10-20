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
val scalaTest = "org.scalatest" %% "scalatest" % "3.2.14"   //AnyFunSuite -- most common
val flatSpec = "org.scalatest" %% "scalatest-flatspec" % "3.2.14" % Test
val funSpec="org.scalatest" %% "scalatest-funspec" % "3.2.14" % Test
val wordSpec="org.scalatest" %% "scalatest-wordspec" % "3.2.14" % Test
val freeSpec = "org.scalatest" %% "scalatest-freespec" % "3.2.14" % Test
val jodaTime = "joda-time" % "joda-time" % "2.12.0"
val mySQLDependency = "mysql" % "mysql-connector-java" % "8.0.30"

val AkkaVersion = "2.6.20"
val allakDependency="com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion
val akkaNewDep="com.typesafe.akka" %% "akka-actor-testkit-typed" % AkkaVersion % Test
val akkaStream="com.typesafe.akka" %% "akka-stream" % "2.6.20"



libraryDependencies ++=Seq(scalaLogging, utilControl, reflect, xml, scalaTest, flatSpec,
  funSpec, wordSpec, freeSpec, jodaTime, mySQLDependency,
  akkaNewDep, akkaStream, allakDependency)



// https://mvnrepository.com/artifact/com.typesafe.scala-logging/scala-logging
//libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"

// https://mvnrepository.com/artifact/com.typesafe.scala-logging/scala-logging-slf4j
//libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2"
