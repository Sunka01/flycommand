package me.sunka.flycommand.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Heal implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String alias, String[] args) {

        Player senderPlayer = (Player) commandSender;

        //-------

        if(args.length == 0) {

            senderPlayer.setHealth(20.0);
            senderPlayer.setHealthScale(20.0);
            commandSender.sendMessage("§6» §8You were healed!");

        }


        return false;
    }
}