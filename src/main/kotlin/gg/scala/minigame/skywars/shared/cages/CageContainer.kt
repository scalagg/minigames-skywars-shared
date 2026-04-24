package gg.scala.minigame.skywars.shared.cages

data class CageContainer(
    val cages: MutableMap<String, Cage> = mutableMapOf()
)
