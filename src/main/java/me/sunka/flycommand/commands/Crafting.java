package me.sunka.flycommand.commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Crafting implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String alias, String[] args) {
        Player senderPlayer = (Player) commandSender;
        if(args.length == 0) {

            senderPlayer.openWorkbench(senderPlayer.getLocation(), true);

        }
        return false;}
}