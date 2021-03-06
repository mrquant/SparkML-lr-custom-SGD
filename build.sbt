name := "SparkLR"

organization := "spark"

version := "1.0"

scalaVersion := "2.11.0"

//resolvers += Resolver.mavenLocal

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.0.1" % "compile"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.0.1" % "compile"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.0.1" % "compile"
libraryDependencies += "org.log4s" %% "log4s" % "1.3.3" % "compile"

mainClass in assembly := Some("spark.linearregression.Main")

assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)
