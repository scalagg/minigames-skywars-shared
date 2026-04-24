package gg.scala.minigame.skywars.shared.kits

object SkyWarsKitRegistry
{
    val kits = setOf(
        ArmorerKit,
        AthleteKit,
        BlacksmithKit,
        BowmanKit,
        ChampionKit,
        HealerKit,
        HoundKit,
        MagicianKit,
        PaladinKit,
        PyromancerKit,
        ScoutKit
    ).associateBy { it.name }
}
