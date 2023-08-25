package me.sunka.flycommand.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class Lifeadd implements Listener {

    @EventHandler
    public void onInteractFixed(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (!event.hasItem()) return;
        if (!event.getItem().hasItemMeta()) return;
        if (!event.getItem().getItemMeta().hasDisplayName()) return;

        Material mat = player.getItemInUse().getType();
        String displayname = event.getItem().getItemMeta().getDisplayName();
        if (displayname.toLowerCase().contains("Heart")) {
            if (mat == Material.TOTEM_OF_UNDYING){
                player.setHealthScale(player.getHealthScale() + 2);
            }
        }
    }
}