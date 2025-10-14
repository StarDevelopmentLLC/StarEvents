package com.stardevllc.starevents.v1_11_2;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityResurrectEvent;

public class EntityEvents_1_11_2 extends EventListener {
    
    public EntityEvents_1_11_2() {
        super(MinecraftVersion.v1_11_2);
    }
    
    @EventHandler
    public void onEntityResurrect(EntityResurrectEvent e) {
        EVENT_BUS.post(e);
    }
}