package com.stardevllc.starevents.v1_10_2;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityAirChangeEvent;
import org.bukkit.event.entity.EntityBreedEvent;

public class EntityEvents_1_10_2 extends EventListener {
    
    public EntityEvents_1_10_2() {
        super(MinecraftVersion.v1_10_2);
    }
    
    @EventHandler
    public void onEntityAirChange(EntityAirChangeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityBreed(EntityBreedEvent e) {
        EVENT_BUS.post(e);
    }
}