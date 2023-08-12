package me.sunka.flycommand.listeners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static org.bukkit.Sound.ENTITY_CAT_AMBIENT;


public class SItem implements Listener {

@EventHandler
public boolean OnjoinServer(PlayerJoinEvent e) {

        Player sender = e.getPlayer();
    String playerName = sender.getName();
    Player target = sender.getServer().getPlayerExact(playerName);
        assert target != null;
                ItemStack startingEmerald = new ItemStack(Material.EMERALD);
                ItemMeta meta = startingEmerald.getItemMeta();
                meta.setDisplayName("§eTest");
                meta.addEnchant(Enchantment.DURABILITY,1,true);
                sender.sendMessage("Welcome first time on the server!");
                startingEmerald.setItemMeta(meta);

                if (sender.hasPlayedBefore()) {
                sender.getInventory().addItem(startingEmerald);
                    sender.playSound(sender.getLocation(), ENTITY_CAT_AMBIENT, 1, 1);
                    System.out.println("Player" + sender.getName() + "Joined for the first time!");
                    sender.sendMessage("§6>> §rWelcome§6 <<");
                    return true;
                } else {
                    sender.sendMessage("Welcome back!");
                    sender.playSound(sender.getLocation(), ENTITY_CAT_AMBIENT, 1, 1);
                    System.out.println("Player" + sender.getName() + "Joined again..");
                }
    return true;
}
                }