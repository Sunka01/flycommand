package me.sunka.flycommand.commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Spawn implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String alias, String[] args) {
        Player senderPlayer = (Player) commandSender;

        if(args.length == 0) {
            World tworld = Bukkit.getServer().getWorld("world");
            Double x = -357.47;
            Double y = 102.00;
            Double z = -399.53;
            Location tloc = new Location(tworld, x, y, z);
            senderPlayer.teleport(tloc);

            commandSender.sendMessage("§6» §a Teleported to spawn!");



        }

        return false;
    }
}
