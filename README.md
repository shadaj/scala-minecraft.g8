Scala-Minecraft Giter8 Template
===============================
This is a Giter8 template for making minecraft mods in Scala.

Prerequisites
-------------
* Minecraft (1.4.7) :P
* Scala (2.10.0) (http://www.scala-lang.org/downloads)
* craftbukkit.jar (1.4.7-R1.0) (http://dl.bukkit.org)
* giter8 (latest version) (https://github.com/n8han/giter8)
* sbt (latest version) (http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html#installing-sbt)

Server set up (one time)
------------------------
* Create a empty folder, which will store your server's files (we will call this "your server's folder")
* Copy scala-library.jar from your Scala installation's lib folder into your server's folder
* Copy craftbukkit.jar into your server's folder
* Copy bukkit-scala_2.10-0.1.jar from https://github.com/shadaj/repos/blob/master/releases/shadaj/bukkit-scala_2.10/0.1/bukkit-scala_2.10-0.1.jar?raw=true to your server's folder
* Copy runserver.sh from the repository (https://raw.github.com/shadaj/scala-minecraft.g8/master/runserver.sh) to your server's folder. Make sure that the extension of the file is .sh and it is executable. If it is not executable, go to terminal, navigate to the folder containing runserver.sh, and execute "chmod a+x runserver.sh"
* Go to terminal, navigate to your server's folder, and execute "runserver.sh"
* Wait for the server to generate the world
* Enjoy your server! (the ip will be localhost)

Using the template
------------------
* Create a template project. Execute

    g8 shadaj/scala-minecraft

  and follow the prompts (for the first trial plugin you may just accept the defaults)
* Build the plugin. Execute

    sbt package
    
* Use the plugin.
  Copy the jar file generated in the build to the plugins folder of your server