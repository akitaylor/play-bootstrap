name := """play-bootstrap-sample"""

version := "1.7.0"

scalaVersion := "3.7.3"

lazy val root = (project in file(".")).enablePlugins(PlayScala)


resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
  guice,
  filters,
  "com.adrianhurt" %% "play-bootstrap" % "1.7.0-P30-B4",
  "org.webjars" % "bootstrap" % "4.6.2" exclude("org.webjars", "jquery"),
  "org.webjars" % "jquery" % "3.7.1",
  "org.webjars" % "font-awesome" % "4.7.0",
  "org.webjars" % "bootstrap-datepicker" % "1.10.0" exclude("org.webjars", "bootstrap")
)

scalafmtOnCompile := true