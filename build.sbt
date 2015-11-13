name := "NearestShrunkCentroids"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies  ++= Seq(
  // other dependencies here
  "org.scalanlp" %% "breeze" % "0.10",
  // native libraries are not included by default. add this if you want them (as of 0.7)
  // native libraries greatly improve performance, but increase jar sizes.
  "org.scalanlp" %% "breeze-natives" % "0.10",
  //library to create the unit test
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
)




