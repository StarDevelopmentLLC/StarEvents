package com.stardevllc.starevents.v1_20_1;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.SpawnerSpawnEvent;

public class EntityEvents_1_20_1 extends EventListener {
    
    public EntityEvents_1_20_1() {
        super(MinecraftVersion.v1_20_1);
    }
    
    @EventHandler
    public void onSpawnerSpawn(SpawnerSpawnEvent e) {
        EVENT_BUS.post(e);
    }
}