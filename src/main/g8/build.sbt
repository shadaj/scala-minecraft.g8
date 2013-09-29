name := "$name$"

version := "$version$"

scalaVersion := "2.10.0"

resolvers += "Bukkit releases" at "http://repo.bukkit.org/content/repositories/releases"

resolvers += "repos" at "https://github.com/shadaj/repos/raw/master/releases"

libraryDependencies += "me.shadaj.minecraft" %% "scala-minecraft-bukkit" % "0.1"

libraryDependencies += "javax.servlet" % "servlet-api" % "2.4" % "provided"