package com.creeperface.nukkitx.placeholders.providers

import com.creeperface.nukkit.placeholderapi.api.PlaceholderAPI
import java.util.function.BiFunction

object NukkitProvider {

    fun registerPlaceholders(papi: PlaceholderAPI) {
        papi.visitorSensitivePlaceholder<Boolean>(
                name = "has_permission",
                loader = BiFunction { p, params -> p.hasPermission(params.single() ?: "") },
                processParameters = true
        )

        papi.visitorSensitivePlaceholder<Int>(
                name = "player_item_in_hand_id",
                loader = BiFunction { p, _ -> p.inventory.itemInHand.id },
                processParameters = true
        )
        papi.visitorSensitivePlaceholder<Int>(
                name = "player_item_in_hand_meta",
                loader = BiFunction { p, _ -> p.inventory.itemInHand.damage },
                processParameters = true
        )
    }
}