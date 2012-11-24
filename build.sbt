libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.12.3" % "test"
)

resolvers ++= Seq(
  "sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
  "sonatype releases"  at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq(
  "com.github.jbrechtel" % "robospecs_2.8.1" % "0.1-SNAPSHOT" % "test"
)

resolvers ++= Seq(
  "jbrechtel snapshots" at "http://jbrechtel.github.com/repo/snapshots"
)

scalacOptions ++= Seq("-unchecked", "-deprecation")
