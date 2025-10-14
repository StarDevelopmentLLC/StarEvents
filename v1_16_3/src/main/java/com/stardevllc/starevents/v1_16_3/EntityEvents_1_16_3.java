package com.stardevllc.starevents.v1_16_3;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.ArrowBodyCountChangeEvent;
import org.bukkit.event.entity.EntitySpellCastEvent;

public class EntityEvents_1_16_3 extends EventListener {
    
    public EntityEvents_1_16_3() {
        super(MinecraftVersion.v1_16_3);
    }
    
    @EventHandler
    public void onArrowBodyCountChange(ArrowBodyCountChangeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntitySpellCast(EntitySpellCastEvent e) {
        EVENT_BUS.post(e);
    }
}