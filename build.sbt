enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

name := "login"

organization := "com.sciabarra"

version := "0.0.1"

scalaVersion := "2.12.2"

scalaJSModuleKind := ModuleKind.CommonJSModule

libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "1.0.0"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0" % "test"

requiresDOM in Test := true

webpackDevServerExtraArgs := Seq("--content-base", baseDirectory.value.getAbsolutePath)

npmDependencies in Compile ++= Seq(
  "react" -> "15.5.4"
  , "react-dom" -> "15.5.4"
  , "expose-loader" -> "0.7.1"
  , "bootstrap" -> "3.3.7"
  , "jquery" -> "3.2.1"
  , "react-codemirror" -> "1.0.0"
  , "react-collapse" -> "4.0.2"
)

enableReloadWorkflow := true