package gg.scala.minigame.skywars.shared

import gg.tropic.practice.kit.feature.GameLifecycle
import gg.tropic.practice.minigame.MiniGameConfiguration

class SkyWarsGameConfiguration(
    val mode: SkyWarsMode,
    override val orchestratorID: String = "sw-${mode.queueType.name.lowercase()}",
    override val lifecycleType: GameLifecycle = GameLifecycle.MiniGame,
    override val maximumPlayers: Int = 4,
    override val maximumPlayersPerTeam: Int = 24,
    override val minimumPlayersRequiredToEnterStarting: Int = 2,
    override val minimumPlayersRequiredToFastForward: Int = 3,
    override val startGameCountDown: Int = 5,
    override val shouldBeAbleToReconnect: Boolean = true,
    override val reconnectThreshold: Long = 120000L,
    override val gameDescription: String = "SkyWars Match",
) : MiniGameConfiguration
{
    override fun getAbstractType() = SkyWarsGameConfiguration::class.java
}
