// Specs2
resolvers ++= Seq(
  "sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "sonatype releases"  at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies += "org.specs2" %% "specs2" % "1.12.3" % "test"

// RoboSpecs
resolvers += "jbrechtel snapshots" at "http://jbrechtel.github.com/repo/snapshots"

libraryDependencies += "com.github.jbrechtel" % "robospecs_2.8.1" % "0.1-SNAPSHOT" % "test"

parallelExecution in Test := false

testOptions in Test += Tests.Argument("sequential")

// Misc
scalacOptions ++= Seq("-unchecked", "-deprecation")
