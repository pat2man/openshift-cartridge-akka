name := """template"""

version := "1.0"

akkaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.9" % "test",
  "org.akkatest" %% "akkatest" % "2.2.4" % "test")
