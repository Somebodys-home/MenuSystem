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
        Inventory topInventory = event.getView().getTopInventory();
        Inventory clickedInventory = event.getClickedInventory();

        if (topInventory.getHolder() instanceof Menu menu && clickedInventory != null) {
            if (clickedInventory.equals(topInventory)) {
                System.out.println("sneed");
                event.setCancelled(true);
                if (event.getCurrentItem() == null) return;

                menu.handleMenu(event);
            }
        }
    }
}
