package me.sunka.flycommand.listeners;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class Lifesteal implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        if(player.getKiller() != null) {


            player.setHealthScale(player.getHealthScale() - 1);
            player.getKiller().setHealthScale(player.getKiller().getHealthScale() + 1);
            if (player.getHealthScale() <= 1) {
                player.kickPlayer("You ran out of health!");
            }
        }
    }
}
