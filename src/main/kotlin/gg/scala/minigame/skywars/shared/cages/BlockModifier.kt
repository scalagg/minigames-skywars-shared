package gg.scala.minigame.skywars.shared.cages

import org.bukkit.Material
import org.bukkit.util.Vector

data class BlockModifier(
    val relationToBaseBlock: Vector,
    val blockType: Material,
    val blockData: Byte = 0
)
