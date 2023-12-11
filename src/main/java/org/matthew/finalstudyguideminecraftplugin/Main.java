package org.matthew.finalstudyguideminecraftplugin;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCreativeEvent;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.event.inventory.InventoryPickupItemEvent;
import org.bukkit.event.player.PlayerAttemptPickupItemEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void pickUpItem(PlayerAttemptPickupItemEvent e) {
        e.setCancelled(true);
        e.getPlayer().sendMessage("Not Allowed to pick up that Item: " + e.getPlayer().toString());
    }

    @EventHandler
    public void placeItemInInventory(InventoryCreativeEvent e) {
        e.setCancelled(true);
        e.getWhoClicked().sendMessage("Not Allowed to pick up that Item:");
    }

}
