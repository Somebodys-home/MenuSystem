package io.github.Gabriel.menuSystem;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public class MenuSystem {
    private final JavaPlugin plugin;
    private final HashMap<Player, PlayerMenuUtility> playerMenuUtilityMap = new HashMap<>();

    public MenuSystem(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public PlayerMenuUtility getPlayerMenuUtility(Player player) {
        return playerMenuUtilityMap.computeIfAbsent(
                player,
                p -> new PlayerMenuUtility(plugin, p)
        );
    }
}