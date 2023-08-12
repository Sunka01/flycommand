package me.sunka.flycommand.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class Tpa implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String alias, String[] args) {
        Player sender = (Player) commandSender;
        String senderNickname = sender.getDisplayName();

        Player target;
        if (args.length == 0) {sender.sendMessage("§cIncorrect number of arguments!");
            return false;
        }
        if (args.length >= 2) {sender.sendMessage("§cIncorrect number of arguments!");
            return false;
        }


        if (args[0].equals("a")) {


            if (HashMaps.tpaCheck.get(senderNickname).equals(true)) {
                String targetNickname;
                targetNickname = HashMaps.tpaPlayer.get(senderNickname);
                target = Bukkit.getPlayerExact(targetNickname);
                sender.teleport(target.getLocation());
                target.sendMessage("§aYou got teleported to " + senderNickname);
                sender.sendMessage("§a" + targetNickname + " teleported to you!");
                HashMaps.tpaCheck.put(null,null);
                HashMaps.tpaPlayer.put(null,null);
            }


        } else if (args[0].equals("d")) {
            if (HashMaps.tpaCheck.get(senderNickname).equals(true)) {
                HashMaps.tpaCheck.put(null,null);
                HashMaps.tpaPlayer.put(null,null);

            }

            sender.sendMessage("OwO");

        } else {
            String targetNickname = args[0];
            target = Bukkit.getPlayer(targetNickname);
            HashMaps.tpaPlayer.put(targetNickname,senderNickname);
            HashMaps.tpaCheck.put(targetNickname, true);
            sender.sendMessage("§aYou sent tpa request to " + targetNickname);
            target.sendMessage("§a"+ senderNickname + " sent you a tpa request!");
        }


        return true;
    }
}
