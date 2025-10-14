package com.stardevllc.starevents.v1_17_1;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.FurnaceStartSmeltEvent;

public class InventoryEvents_1_17_1 extends EventListener {
    
    public InventoryEvents_1_17_1() {
        super(MinecraftVersion.v1_17_1);
    }
    
    @EventHandler
    public void onFurnaceStartSmelt(FurnaceStartSmeltEvent e) {
        EVENT_BUS.post(e);
    }
}