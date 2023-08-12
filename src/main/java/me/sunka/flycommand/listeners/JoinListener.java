package me.sunka.flycommand.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import static org.bukkit.Bukkit.getServer;

public class JoinListener implements Listener {


    
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if(player.hasPlayedBefore()) {
            event.setJoinMessage("§8[§a+§8]§7 Player " + player.getDisplayName() + " has joined the first time!");
        } else event.setJoinMessage("§8[§a+§8]§7 Player " + player.getDisplayName() +" has joined!");

    }


    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage("§8[§c-§8]§7 Player " + player.getDisplayName() + " has left!");
    }

}
