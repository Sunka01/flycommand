package me.sunka.flycommand;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

public class SpawnLocation {

    public static void main(String[] args, Location tloc) {


    World tworld = Bukkit.getServer().getWorld("world");
    Double x = -323.46;
    Double y = 106.00;
    Double z = -267.10;
    tloc = new Location(tworld, x, y, z);
    }
}
