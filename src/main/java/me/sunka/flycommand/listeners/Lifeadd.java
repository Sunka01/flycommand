package me.sunka.flycommand.listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.meta.ItemMeta;

public class Lifeadd implements Listener {

    @EventHandler
    public void onInteractFixed(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (!event.hasItem()) return;
        if (!event.getItem().hasItemMeta()) return;
        if (!event.getItem().getItemMeta().hasDisplayName()) return;
        Material mat = event.getMaterial();
        String displayname = event.getItem().getItemMeta().getDisplayName();
        if (mat == Material.TOTEM_OF_UNDYING) {
            if (displayname.toLowerCase().contains("heart")) {
                player.setHealthScale(player.getHealthScale() + 2);
                player.getInventory().remove(Material.TOTEM_OF_UNDYING);
            }
        }
    }
}