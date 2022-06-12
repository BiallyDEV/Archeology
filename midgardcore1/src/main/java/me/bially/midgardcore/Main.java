package me.bially.midgardcore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Archaeology(), this);

        this.getLogger().info("MidgardCore enabled.");
    }

    @Override
    public void onDisable() {this.getLogger().info("MidgardCore disabled.");
    }
}

