package com.stardevllc.starevents.v1_11_2;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.BrewingStandFuelEvent;

public class InventoryEvents_1_11_2 extends EventListener {
    
    public InventoryEvents_1_11_2() {
        super(MinecraftVersion.v1_11_2);
    }
    
    @EventHandler
    public void onBrewingStandFuel(BrewingStandFuelEvent e) {
        EVENT_BUS.post(e);
    }
}