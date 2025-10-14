package com.stardevllc.starevents.v1_16_5;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityExhaustionEvent;
import org.bukkit.event.entity.PiglinBarterEvent;

public class EntityEvents_1_16_5 extends EventListener {
    
    public EntityEvents_1_16_5() {
        super(MinecraftVersion.v1_16_5);
    }
    
    @EventHandler
    public void onEntityExhaustion(EntityExhaustionEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPiglinBarter(PiglinBarterEvent e) {
        EVENT_BUS.post(e);
    }
}