package gg.scala.minigame.skywars.shared.cages

data class SchemaCageContainer(
    val schemas: MutableMap<String, SchemaCage> = mutableMapOf()
)
