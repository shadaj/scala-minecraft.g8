name := "$name$"

version := "$version$"

resolvers += "Bukkit releases" at "http://repo.bukkit.org/content/repositories/releases"

resolvers += "repos" at "https://github.com/shadaj/repos/raw/master/releases"

libraryDependencies += "org.bukkit" % "bukkit" % "1.4.6-R0.3"

libraryDependencies += "shadaj" %% "bukkit-scala" % "0.1"