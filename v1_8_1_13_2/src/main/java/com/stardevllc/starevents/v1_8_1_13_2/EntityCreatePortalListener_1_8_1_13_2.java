package com.stardevllc.starevents.v1_8_1_13_2;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityCreatePortalEvent;

public class EntityCreatePortalListener_1_8_1_13_2 extends EventListener {
    
    public EntityCreatePortalListener_1_8_1_13_2() {
        super(MinecraftVersion.v1_8, MinecraftVersion.v1_13_2);
    }
    
    @EventHandler
    public void onEntityCreatePortal(EntityCreatePortalEvent e) {
        EVENT_BUS.post(e);
    }
}