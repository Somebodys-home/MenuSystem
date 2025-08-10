package io.github.NoOne.menuSystem;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.PlayerInventory;

public class MenuListener implements Listener {
    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        Inventory clickedInventory = event.getClickedInventory();
        Inventory topInventory = event.getView().getTopInventory();
        Inventory bottomInventory = event.getView().getBottomInventory();

        if (clickedInventory != null && topInventory.getHolder() instanceof Menu menu) {
            if (event.getCurrentItem() == null || event.getCurrentItem().getType().isAir()) return;

            if (clickedInventory.equals(topInventory)) {
                menu.handleMenu(event);
            } else if (clickedInventory.equals(bottomInventory)) {
                menu.handlePlayerMenu(event);
            }
        }
    }
}
