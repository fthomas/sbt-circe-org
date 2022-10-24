val sbtTypelevelVersion = "0.4.16" // https://github.com/typelevel/sbt-typelevel/releases
val sbtScoverageVersion = "2.0.6" // https://github.com/scoverage/sbt-scoverage/releases

addSbtPlugin("org.typelevel" % "sbt-typelevel" % sbtTypelevelVersion)
addSbtPlugin("org.typelevel" % "sbt-typelevel-site" % sbtTypelevelVersion)
addSbtPlugin("org.typelevel" % "sbt-typelevel-scalafix" % sbtTypelevelVersion)
addSbtPlugin("org.scoverage" % "sbt-scoverage" % sbtScoverageVersion)
