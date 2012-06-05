import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play-db-heroku"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "postgresql"%"postgresql"%"9.1-901-1.jdbc4",
      "com.github.twitter" % "bootstrap" % "2.0.3"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here
      resolvers += "webjars" at "http://webjars.github.com/m2"      
    )

}
