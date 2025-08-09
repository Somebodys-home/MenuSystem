package io.github.NoOne.menuSystem;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.PlayerInventory;

public class MenuListener implements Listener {
    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        if (event.getView().getTopInventory().getHolder() instanceof Menu menu && event.getClickedInventory() != null) {
            System.out.println("sneed");
            event.setCancelled(true);
            if (event.getCurrentItem() == null) return;

            menu.handleMenu(event);
//            if (event.getClickedInventory().equals(event.getView().getTopInventory())) {
//                System.out.println("sneed");
//                event.setCancelled(true);
//                if (event.getCurrentItem() == null) return;
//
//                menu.handleMenu(event);
//            }
        }
    }
}
