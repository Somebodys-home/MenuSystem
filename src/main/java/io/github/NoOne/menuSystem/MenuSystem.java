package io.github.NoOne.menuSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class MenuSystem {
    private static final HashMap<UUID, PlayerMenuUtility> playerMenuUtilityMap = new HashMap<>();

    public static PlayerMenuUtility getPlayerMenuUtility(UUID uuid) {
        if (!playerMenuUtilityMap.containsKey(uuid)) playerMenuUtilityMap.put(uuid, new PlayerMenuUtility(uuid));

        return playerMenuUtilityMap.get(uuid);
    }
}
