package gg.scala.minigame.skywars.shared.profile

import gg.scala.commons.persist.ProfileOrchestrator
import gg.scala.flavor.service.Service
import java.util.*

@Service
object SkyWarsProfileService : ProfileOrchestrator<SkyWarsProfile>()
{
    override fun new(uniqueId: UUID) = SkyWarsProfile(uniqueId)
    override fun type() = SkyWarsProfile::class
}
