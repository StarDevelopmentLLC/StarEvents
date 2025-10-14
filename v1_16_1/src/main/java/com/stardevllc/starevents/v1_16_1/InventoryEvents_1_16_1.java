package com.stardevllc.starevents.v1_16_1;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.PrepareSmithingEvent;

public class InventoryEvents_1_16_1 extends EventListener {
    
    public InventoryEvents_1_16_1() {
        super(MinecraftVersion.v1_16_1);
    }
    
    @EventHandler
    public void onPrepareSmithing(PrepareSmithingEvent e) {
        EVENT_BUS.post(e);
    }
}