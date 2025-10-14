package com.stardevllc.starevents.v1_21_1;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.TrialSpawnerSpawnEvent;

public class EntityEvents_1_21_1 extends EventListener {
    
    public EntityEvents_1_21_1() {
        super(MinecraftVersion.v1_21_1);
    }
    
    @EventHandler
    public void onTrailSpawnerSpawn(TrialSpawnerSpawnEvent e) {
        EVENT_BUS.post(e);
    }
}