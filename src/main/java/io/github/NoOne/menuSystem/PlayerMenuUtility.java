package io.github.NoOne.menuSystem;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class PlayerMenuUtility {
    private final UUID owner;

    public PlayerMenuUtility(UUID owner) {
        this.owner = owner;
    }

    public Player getOwner() {
        return Bukkit.getPlayer(owner);
    }
}
