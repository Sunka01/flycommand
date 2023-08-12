package me.sunka.flycommand.commands;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class  Fly implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String alias, String[] args) {

        if (!(commandSender instanceof Player)) {
            System.out.println("Player only!");
            return true;
        }

        Player senderPlayer = (Player) commandSender;
        Player targetPlayer;

        if (args.length == 0) {
            targetPlayer = senderPlayer;
        } else {
            String nickname = args[0];
            targetPlayer = Bukkit.getPlayer(nickname);
        }

        if (targetPlayer == null) {
            senderPlayer.sendMessage("§6» §c This player doesnt exist or isnt online!");
            return true;
        }


        if (targetPlayer.getAllowFlight()) {
            targetPlayer.setAllowFlight(false);
            targetPlayer.setFlying(false);
            targetPlayer.sendMessage("§6» §aFly disabled!");
        } else {
            targetPlayer.setAllowFlight(true);
            targetPlayer.sendMessage("§6» §aFly enabled!");
        }

        if (targetPlayer != senderPlayer) {
            senderPlayer.sendMessage("§6» §aFly for '" + targetPlayer.getName() + "' changed!");
        }

        return true;
    }


}