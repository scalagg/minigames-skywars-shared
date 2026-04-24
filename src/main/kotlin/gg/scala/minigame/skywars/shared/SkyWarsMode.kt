package gg.scala.minigame.skywars.shared

import gg.tropic.practice.minigame.MiniGameMode
import gg.tropic.practice.provider.MiniProviderVersion
import gg.tropic.practice.queue.QueueType

enum class SkyWarsMode(
    val queueType: QueueType,
    val providerVersion: MiniProviderVersion
) : MiniGameMode
{
    RANKED(QueueType.Ranked, MiniProviderVersion.LEGACY)
    {
        override val teamSize: Int = 1
        override val teamCount: Int = 4
        override fun maxPlayers(): Int = 4
    },
    MINI(QueueType.Casual, MiniProviderVersion.LEGACY)
    {
        override val teamSize: Int = 1
        override val teamCount: Int = 4
        override fun maxPlayers(): Int = 4
    },
    SOLO(QueueType.Casual, MiniProviderVersion.LEGACY)
    {
        override val teamSize: Int = 1
        override val teamCount: Int = 16
        override fun maxPlayers(): Int = 16
    },
    TEAMS(QueueType.Casual, MiniProviderVersion.LEGACY)
    {
        override val teamSize: Int = 2
        override val teamCount: Int = 12
        override fun maxPlayers(): Int = 24
    }
}
