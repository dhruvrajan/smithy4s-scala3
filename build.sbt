import smithy4s.codegen.Smithy4sCodegenPlugin

val scala3Version = "3.6.3"

lazy val root = project
  .in(file("api"))
  .enablePlugins(Smithy4sCodegenPlugin)
  .settings(
    name := "experiments-scala",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "1.0.0" % Test,
      "com.disneystreaming.smithy4s" %% "smithy4s-http4s" % smithy4sVersion.value,
      "com.disneystreaming.smithy4s" %% "smithy4s-http4s-swagger" % smithy4sVersion.value,
      "org.http4s" %% "http4s-ember-server" % "0.23.26"
    )
  )