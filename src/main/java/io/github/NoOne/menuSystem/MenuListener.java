package io.github.Gabriel.menuSystem;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryHolder;

import java.util.Objects;

public class MenuListener implements Listener {
    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        if (event.getClickedInventory() == null) return;

        InventoryHolder holder = event.getClickedInventory().getHolder();
        if (holder instanceof Menu menu) {
            event.setCancelled(true);

            if (event.getCurrentItem() == null || event.getCurrentItem().getType().isAir()) return;

            menu.handleMenu(event);
        }
    }

}
