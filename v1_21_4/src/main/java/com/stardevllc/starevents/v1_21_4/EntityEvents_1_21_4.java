package com.stardevllc.starevents.v1_21_4;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.VillagerReputationChangeEvent;

public class EntityEvents_1_21_4 extends EventListener {
    
    public EntityEvents_1_21_4() {
        super(MinecraftVersion.v1_21_4);
    }
    
    @EventHandler
    public void onVillagerReputationChange(VillagerReputationChangeEvent e) {
        EVENT_BUS.post(e);
    }
}
