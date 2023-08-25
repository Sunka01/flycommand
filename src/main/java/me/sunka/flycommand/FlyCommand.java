package me.sunka.flycommand;

import me.sunka.flycommand.commands.*;
import me.sunka.flycommand.listeners.JoinListener;
import me.sunka.flycommand.listeners.Lifesteal;
import me.sunka.flycommand.listeners.SItem;
import org.bukkit.plugin.java.JavaPlugin;

public final class FlyCommand extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin se zapina!");
        // Commands
        this.getCommand("fly").setExecutor(new Fly());
        this.getCommand("hello").setExecutor(new Hello());
        this.getCommand("home").setExecutor(new Home());
        this.getCommand("sethome").setExecutor(new SetHome());
        this.getCommand("heal").setExecutor(new Heal());
        this.getCommand("feed").setExecutor(new Feed());
        this.getCommand("gmc").setExecutor(new GMC());
        this.getCommand("gms").setExecutor(new GMS());
        this.getCommand("spawn").setExecutor(new Spawn());
        this.getCommand("craft").setExecutor(new Crafting());
        this.getCommand("kit").setExecutor(new Kit());
        this.getCommand("back").setExecutor(new Back());
        this.getCommand("tpa").setExecutor(new Tpa());

        // Listeners
        this.getServer().getPluginManager().registerEvents(new JoinListener(), this);
        this.getServer().getPluginManager().registerEvents(new SItem(), this);
        this.getServer().getPluginManager().registerEvents(new Lifesteal(), this);

    }

    @Override
    public void onDisable() {
        System.out.println("Plugin se vypina!");
    }
}
