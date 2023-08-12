package me.sunka.flycommand.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Kit implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String alias, String[] args) {
        Player sender = (Player) commandSender;
        String playerName = sender.getName();
        Player target = sender.getServer().getPlayerExact(playerName);
        if (target == null) {
            
            
            
            
            
        target.getInventory().addItem(new ItemStack(Material.STONE_SWORD));
        target.getInventory().addItem(new ItemStack(Material.STONE_PICKAXE));
        target.getInventory().addItem(new ItemStack(Material.STONE_AXE));
        target.getInventory().addItem(new ItemStack(Material.STONE_SHOVEL));
        target.getInventory().addItem(new ItemStack(Material.BREAD));
        target.getInventory().addItem(new ItemStack(Material.LEATHER_HELMET));
        target.getInventory().addItem(new ItemStack(Material.LEATHER_CHESTPLATE));
        target.getInventory().addItem(new ItemStack(Material.LEATHER_LEGGINGS));
        target.getInventory().addItem(new ItemStack(Material.LEATHER_BOOTS));
        target.sendMessage("§6» §aHere you go!");
    }
        return true;}
}
