package io.github.NoOne.menuSystem;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class MenuSystem {
    private static final HashMap<UUID, PlayerMenuUtility> playerMenuUtilityMap = new HashMap<>();

    public MenuSystem() {}

    public static PlayerMenuUtility getPlayerMenuUtility(Player player) {
        UUID uuid = player.getUniqueId();

        if (!playerMenuUtilityMap.containsKey(uuid)) playerMenuUtilityMap.put(uuid, new PlayerMenuUtility(uuid));

        return playerMenuUtilityMap.get(uuid);
    }
}
