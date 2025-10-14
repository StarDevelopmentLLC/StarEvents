package com.stardevllc.starevents.v1_14_1;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.VillagerCareerChangeEvent;

public class EntityEvents_1_14_1 extends EventListener {
    
    public EntityEvents_1_14_1() {
        super(MinecraftVersion.v1_14_1);
    }
    
    @EventHandler
    public void onVillagerCareerChange(VillagerCareerChangeEvent e) {
        EVENT_BUS.post(e);
    }
}
