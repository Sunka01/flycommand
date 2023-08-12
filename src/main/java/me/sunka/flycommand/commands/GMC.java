package me.sunka.flycommand.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GMC implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String alias, String[] args) {
        Player senderPlayer = (Player) commandSender;
        Player targetPlayer;

        if(args.length == 0) {
        targetPlayer = senderPlayer;
        targetPlayer.setGameMode(GameMode.CREATIVE);

        }

        return false;}

}
