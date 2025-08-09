package io.github.NoOne.menuSystem;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.PlayerInventory;

public class MenuListener implements Listener {
    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        event.setCancelled(true);
        System.out.println("Inventory action: " + event.getAction());
        System.out.println("Click type: " + event.getClick());
//        if (event.getView().getTopInventory().getHolder() instanceof Menu menu && event.getClickedInventory() != null) {
//            if (event.getClickedInventory().equals(event.getView().getTopInventory())) {
//                System.out.println("sneed");
//                event.setCancelled(true);
//            event.getClickedInventory().setItem(event.getSlot(), event.getCurrentItem());
//
//            if (event.getCurrentItem() == null || event.getCurrentItem().getType().isAir()) return;
//
//            menu.handleMenu(event);
//            }
//        }
    }
}
