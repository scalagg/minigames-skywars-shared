package gg.scala.minigame.skywars.shared.cages

import org.bukkit.Material
import org.bukkit.util.Vector

object SchemaCageDefaultSchemas
{
    val DEFAULT = SchemaCage("default").apply {
        base(Material.GLASS)
        pillar(1, 0, Material.GLASS)
        pillar(-1, 0, Material.GLASS)
        pillar(0, 1, Material.GLASS)
        pillar(0, -1, Material.GLASS)

        addBlockModifier(
            Vector(0, 4, 0),
            Material.GLASS
        )
    }
}
