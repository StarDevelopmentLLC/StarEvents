package com.stardevllc.starevents.v1_13_2;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.BatToggleSleepEvent;
import org.bukkit.event.entity.EntityTransformEvent;

public class EntityEvents_1_13_2 extends EventListener {
    
    public EntityEvents_1_13_2() {
        super(MinecraftVersion.v1_13_2);
    }
    
    @EventHandler
    public void onBatToggleSleep(BatToggleSleepEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityTransform(EntityTransformEvent e) {
        EVENT_BUS.post(e);
    }
}
