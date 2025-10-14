package com.stardevllc.starevents.plugin;

import com.stardevllc.starevents.StarEvents;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class StarEventsPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        Plugin starCorePlugin = Bukkit.getPluginManager().getPlugin("StarCore");
        if (starCorePlugin != null) {
            getLogger().severe("StarCore detected. StarCore already provides StarEvents");
            getLogger().severe("There will be problems if one of them are not removed.");
        }
        
        getLogger().info("Loading StarEvents as a plugin");
        StarEvents.init(this);
        getLogger().info(StarEvents.getSuccesfulListeners().size() + " listeners successfully registered");
        getLogger().info(StarEvents.getFailedListeners().size() + " listeners failed to load");
        getLogger().info(StarEvents.getOutOfRangeListeners().size() + " listeners were not loaded because they don't support this version");
    }
}