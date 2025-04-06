package io.github.Gabriel.menuSystem;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class MenuSystem extends JavaPlugin {
    private final JavaPlugin menuSystem;
    private final HashMap<Player, PlayerMenuUtility> playerMenuUtilityMap = new HashMap<>();

    public MenuSystem(JavaPlugin menuSystem) {
        this.menuSystem = menuSystem;
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new MenuListener(), this);
    }

    public PlayerMenuUtility getPlayerMenuUtility(Player player, JavaPlugin plugin) {
        return playerMenuUtilityMap.computeIfAbsent(
                player,
                uuid -> new PlayerMenuUtility(plugin, player)
        );
    }
}
