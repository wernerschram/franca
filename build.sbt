scalaVersion in ThisBuild := "2.13.0"

val testVersion = "3.0.8"
val spec2Version = "4.7.0"

ThisBuild / resolvers += Resolver.bintrayIvyRepo("wernerschram", "ivy")

lazy val root = project in file(".") aggregate(
  francaLingua,
  francaInterpreter,
  interpretExample,
)

lazy val francaLingua = (project in file("lingua"))
  .settings(
    name := "franca.lingua",
    libraryDependencies += "org.specs2" %% "specs2-core" % spec2Version % Test,
    libraryDependencies += "org.scalatest" %% "scalatest" % testVersion % Test,
  )

lazy val francaInterpreter = (project in file("interpreter"))
  .settings(
    name := "franca.interpreter",
    libraryDependencies += "org.specs2" %% "specs2-core" % spec2Version % Test,
    libraryDependencies += "org.scalatest" %% "scalatest" % testVersion % Test,
  ).dependsOn(francaLingua)

lazy val interpretExample = (project in file("examples/interpret"))
  .settings(
    name := "franca.examples.interpret",
  ).dependsOn(francaInterpreter)
