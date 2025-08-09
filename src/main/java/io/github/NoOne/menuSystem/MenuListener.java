package io.github.NoOne.menuSystem;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.PlayerInventory;

public class MenuListener implements Listener {
    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        if (event.getClickedInventory() == null) return;

        InventoryHolder holder = event.getClickedInventory().getHolder();
        if (holder instanceof Menu menu) {
            System.out.println("sneed");
            event.setCancelled(true);
//            event.getClickedInventory().setItem(event.getSlot(), event.getCurrentItem());
//
//            if (event.getCurrentItem() == null || event.getCurrentItem().getType().isAir()) return;

            menu.handleMenu(event);
        }
    }
}
