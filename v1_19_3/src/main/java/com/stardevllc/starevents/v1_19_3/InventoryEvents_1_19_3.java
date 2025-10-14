package com.stardevllc.starevents.v1_19_3;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.PrepareGrindstoneEvent;

public class InventoryEvents_1_19_3 extends EventListener {
    
    public InventoryEvents_1_19_3() {
        super(MinecraftVersion.v1_19_3);
    }
    
    @EventHandler
    public void onPrepareGrindstone(PrepareGrindstoneEvent e) {
        EVENT_BUS.post(e);
    }
}