package com.stardevllc.starevents.v1_21_7;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityRemoveEvent;

public class EntityEvents_1_21_7 extends EventListener {
    
    public EntityEvents_1_21_7() {
        super(MinecraftVersion.v1_21_7);
    }
    
    @EventHandler
    public void onEntityRemove(EntityRemoveEvent e) {
        EVENT_BUS.post(e);
    }
}