package com.stardevllc.starevents.v1_14;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityPoseChangeEvent;

public class EntityEvents_1_14 extends EventListener {
    
    public EntityEvents_1_14() {
        super(MinecraftVersion.v1_14);
    }
    
    @EventHandler
    public void onEntityPoseChange(EntityPoseChangeEvent e) {
        EVENT_BUS.post(e);
    }
}