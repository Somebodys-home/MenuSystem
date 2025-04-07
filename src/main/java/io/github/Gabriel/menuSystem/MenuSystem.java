package io.github.Gabriel.menuSystem;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class MenuSystem extends JavaPlugin {
    private static JavaPlugin menuSystem;
    private static final HashMap<Player, PlayerMenuUtility> playerMenuUtilityMap = new HashMap<>();

    @Override
    public void onEnable() {
        menuSystem = this;
        getServer().getPluginManager().registerEvents(new MenuListener(), this);
    }

    public static PlayerMenuUtility getPlayerMenuUtility(Player player) {
        PlayerMenuUtility playerMenuUtility;

        if (playerMenuUtilityMap.containsKey(player)) {
            return playerMenuUtilityMap.get(player);
        } else {
            playerMenuUtility = new PlayerMenuUtility(menuSystem, player);
            playerMenuUtilityMap.put(player, playerMenuUtility);
            return playerMenuUtility;
        }
    }
}
