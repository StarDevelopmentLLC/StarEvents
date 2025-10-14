package com.stardevllc.starevents.v1_16_1;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityEnterLoveModeEvent;
import org.bukkit.event.entity.StriderTemperatureChangeEvent;

public class EntityEvents_1_16_1 extends EventListener {
    
    public EntityEvents_1_16_1() {
        super(MinecraftVersion.v1_16_1);
    }
    
    @EventHandler
    public void onEntityEnterLoveMode(EntityEnterLoveModeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onStriderTemperatureChange(StriderTemperatureChangeEvent e) {
        EVENT_BUS.post(e);
    }
}