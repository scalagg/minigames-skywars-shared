package gg.scala.minigame.skywars.shared.cages

import org.bukkit.inventory.ItemStack

data class Cage(
    val id: String,
    var displayName: String,
    var item: ItemStack,
    var description: List<String>,
    var linkedSchema: String,
    var price: Float,
    var rarity: CageRarity,
    var purchasable: Boolean = true
)
{
    fun editAndSave(block: Cage.() -> Unit)
    {
        block(this)

        val cached = CageDataSync.cached()
        cached.cages[id] = this
        CageDataSync.sync(cached)
    }
}
