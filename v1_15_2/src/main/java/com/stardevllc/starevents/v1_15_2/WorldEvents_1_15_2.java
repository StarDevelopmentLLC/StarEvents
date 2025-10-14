package com.stardevllc.starevents.v1_15_2;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.LootGenerateEvent;
import org.bukkit.event.world.TimeSkipEvent;

public class WorldEvents_1_15_2 extends EventListener {
    
    public WorldEvents_1_15_2() {
        super(MinecraftVersion.v1_15_2);
    }
    
    @EventHandler
    public void onTimeSkip(TimeSkipEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onLootGenerate(LootGenerateEvent e) {
        EVENT_BUS.post(e);
    }
}