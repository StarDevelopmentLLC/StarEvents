package com.stardevllc.starevents.v1_15_2;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityEnterBlockEvent;

public class EntityEvents_1_15_2 extends EventListener {
    
    public EntityEvents_1_15_2() {
        super(MinecraftVersion.v1_15_2);
    }
    
    @EventHandler
    public void onEntityEnterBlock(EntityEnterBlockEvent e) {
        EVENT_BUS.post(e);
    }
}