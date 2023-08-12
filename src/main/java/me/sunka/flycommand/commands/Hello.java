package me.sunka.flycommand.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getPlayer;
import static org.bukkit.Bukkit.getServer;

public class Hello implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String alias, String[] args) {
        Player player = (Player) commandSender;
        getServer().broadcastMessage(player.getName() + " says Hello!");


        return true;
    }


}