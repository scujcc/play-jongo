import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play-jongo"
    val appVersion      = "0.3-SNAPSHOT"

    val appDependencies = Seq(
      "org.mongodb" % "mongo-java-driver" % "2.8.0", 
      "org.jongo" % "jongo" % "0.3-SNAPSHOT"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      organization := "uk.co.panaxiom" 
    )

}
