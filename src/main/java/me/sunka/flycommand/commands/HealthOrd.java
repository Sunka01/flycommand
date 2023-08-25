package me.sunka.flycommand.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HealthOrd implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String alias, String[] args) {
        Player senderPlayer = (Player) commandSender;

    ItemStack endparkour = new ItemStack(Material.TOTEM_OF_UNDYING);
    ItemMeta metaep = endparkour.getItemMeta();
        metaep.setDisplayName("HEART");
        endparkour.setItemMeta(metaep);
        senderPlayer.getInventory().addItem(endparkour);
    return true;}
}
