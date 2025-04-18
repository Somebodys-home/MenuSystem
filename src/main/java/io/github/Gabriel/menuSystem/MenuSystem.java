package io.github.Gabriel.menuSystem;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public final class MenuSystem {

    private static final Map<Player, PlayerMenuUtility> playerMenuUtilityMap = new HashMap<>();

    // Prevent instantiation
    private MenuSystem() {}

    public static PlayerMenuUtility getPlayerMenuUtility(Player player) {
        return playerMenuUtilityMap.computeIfAbsent(player, p -> new PlayerMenuUtility(p));
    }

    // Optional method if you want to clear memory when players quit
    public static void removePlayerMenuUtility(Player player) {
        playerMenuUtilityMap.remove(player);
    }
}

