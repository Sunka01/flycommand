package me.sunka.flycommand.commands;


import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetHome implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String alias, String[] args) {
        Player senderPlayer = (Player) commandSender;

        if(args.length == 0) {
            Location Location = senderPlayer.getPlayer().getLocation();
            senderPlayer.getPlayer().setBedSpawnLocation(Location, true);
            senderPlayer.getPlayer().sendMessage("§6» §a Your Home has been set");
        }






        return false;
    }
}