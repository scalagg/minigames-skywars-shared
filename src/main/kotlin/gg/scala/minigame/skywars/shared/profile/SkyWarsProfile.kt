package gg.scala.minigame.skywars.shared.profile

import gg.scala.store.controller.DataStoreObjectControllerCache
import gg.scala.store.storage.storable.IDataStoreObject
import gg.scala.store.storage.type.DataStoreStorageType
import java.util.*

data class SkyWarsProfile(
    override val identifier: UUID,
    var selectedKit: String? = null
) : IDataStoreObject
{
    fun save() = DataStoreObjectControllerCache
        .findNotNull<SkyWarsProfile>()
        .save(this, DataStoreStorageType.MONGO)
}
