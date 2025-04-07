package io.github.Gabriel.menuSystem;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerMenuUtility {
    private Player owner;

    public PlayerMenuUtility(Player owner) {
        this.owner = owner;
    }
    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
}
