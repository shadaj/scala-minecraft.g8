Scala-Minecraft Giter8 Template
===============================
This is a Giter8 template for making minecraft mods in Scala.

Prerequisites
-------------
* Minecraft (1.5.1) :P
* giter8 (latest version) (https://github.com/n8han/giter8)
* sbt (latest version) (http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html#installing-sbt)

Server set up (easy way)
------------------------
* Create a empty folder, which will store your server's files (we will call this "your server's folder")

* Download setup-server.sh from my github repository using curl:

    curl -L -C - -O https://raw.github.com/shadaj/scala-minecraft.g8/master/setup-server.sh

* Run chmod a+x setup-server.sh

* Execute setup-server.sh

* Go to terminal, navigate to your server's folder, and execute 
    run-server.sh

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