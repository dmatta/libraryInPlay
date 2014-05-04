name := "library-in-play"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  cache
)     

play.Project.playJavaSettings

lazy val services = project

lazy val root = project.in(file("."))
    .dependsOn(services)
    .aggregate(services)
