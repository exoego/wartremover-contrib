addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.8.1")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.3")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
