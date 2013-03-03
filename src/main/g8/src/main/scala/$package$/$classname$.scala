package $package$

import me.shadaj.ScalaPlugin
import org.bukkit.event.block.BlockPlaceEvent

class $classname$ extends ScalaPlugin {
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