package io.github.Gabriel.menuSystem;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerMenuUtility {
    private JavaPlugin plugin;
    private Player owner;

    public PlayerMenuUtility(JavaPlugin plugin, Player owner) {
        this.plugin = plugin;
        this.owner = owner;
    }
    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public JavaPlugin getPlugin() {
        return plugin;
    }
}
