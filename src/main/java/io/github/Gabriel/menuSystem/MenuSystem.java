package io.github.Gabriel.menuSystem;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public class MenuSystem {
    private final JavaPlugin plugin;
    private final HashMap<UUID, PlayerMenuUtility> playerMenuUtilityMap = new HashMap<>();

    public MenuSystem(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public PlayerMenuUtility getPlayerMenuUtility(Player player) {
        return playerMenuUtilityMap.computeIfAbsent(
                player.getUniqueId(),
                p -> new PlayerMenuUtility(plugin, player)
        );
    }
}