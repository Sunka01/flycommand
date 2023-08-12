package me.sunka.flycommand.commands;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Back implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String alias, String[] args) {
        Player sender = (Player) commandSender;
    if(sender.getLastDeathLocation()==null) {
    sender.sendMessage("§aNo death position found!");

    } else {
        sender.teleport(sender.getLastDeathLocation());
        sender.sendMessage("§a>> You were teleported to last known death location!");}
    return true;}
}
