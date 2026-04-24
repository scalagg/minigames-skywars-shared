package gg.scala.minigame.skywars.shared.kits

import net.evilblock.cubed.util.bukkit.ItemBuilder
import org.bukkit.entity.Player

interface SkyWarsKit
{
    val name: String
    val icon: ItemBuilder

    fun applyArmor(player: Player)
    fun applyInventoryContents(player: Player)
}
