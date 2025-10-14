package com.stardevllc.starevents.v1_12_2;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityPickupItemEvent;

public class EntityEvents_1_12_2 extends EventListener {
    
    public EntityEvents_1_12_2() {
        super(MinecraftVersion.v1_12_2);
    }
    
    @EventHandler
    public void onEntityItemPickup(EntityPickupItemEvent e) {
        EVENT_BUS.post(e);
    }
}