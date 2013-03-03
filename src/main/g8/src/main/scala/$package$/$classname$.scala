package $package$

import org.bukkit.plugin.java.JavaPlugin

class $classname$ extends JavaPlugin {
  def handleBlockPlacement = (event: BlockPlaceEvent) => {
    val player = event.getPlayer
    val block = event.getBlockPlaced

    val location = block.getLocation()
    player.sendMessage("You placed a " + block.getType + " at " + "(" + location.getBlockX + "," + location.getBlockY + "," + location.getBlockZ + ")")
  }

  override def onEnable() {
    getServer.getPluginManager.registerEvents(handleBlockPlacement, this);
  }
}