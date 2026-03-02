package io.github.NoOne.menuSystem;

import java.util.UUID;

public class PlayerMenuUtility {
    private UUID owner;

    public PlayerMenuUtility(UUID owner) {
        this.owner = owner;
    }
    public UUID getOwner() {
        return owner;
    }

    public void setOwner(UUID owner) {
        this.owner = owner;
    }
}
