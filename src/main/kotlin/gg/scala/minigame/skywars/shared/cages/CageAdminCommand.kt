package gg.scala.minigame.skywars.shared.cages

import gg.scala.commons.acf.annotation.CommandAlias
import gg.scala.commons.acf.annotation.CommandPermission
import gg.scala.commons.acf.annotation.Default
import gg.scala.commons.annotations.commands.AutoRegister
import gg.scala.commons.command.ScalaCommand
import gg.scala.commons.issuer.ScalaPlayer

@AutoRegister
@CommandAlias("cageadmin")
@CommandPermission("practice.command.cageadmin")
object CageAdminCommand : ScalaCommand()
{
    @Default
    fun help(player: ScalaPlayer) = CageViewAllMenu().openMenu(player.bukkit())
}
