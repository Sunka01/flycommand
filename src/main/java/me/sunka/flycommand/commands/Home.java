package me.sunka.flycommand.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Home implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String alias, String[] args) {
        Player senderPlayer = (Player) commandSender;

        if (senderPlayer != null) {
            Player player = (Player) senderPlayer;
            if (args.length == 0) {
                ;
                if (senderPlayer.getBedSpawnLocation() != null) {
                    senderPlayer.teleport(senderPlayer.getBedSpawnLocation());
                    senderPlayer.sendMessage("§6» §8You were teleported to home!");
                    senderPlayer.teleport(senderPlayer.getBedSpawnLocation());
                } else {
                    senderPlayer.sendMessage("§6» §cYou dont have any home set!");
                }

            }

        } else {

            System.out.println("§6» §cOnly player can execute this command!");

        }


        return false;
    }

}
