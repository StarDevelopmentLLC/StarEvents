package com.stardevllc.starevents.v1_17_1;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.*;

public class WorldEvents_1_17_1 extends EventListener {
    
    public WorldEvents_1_17_1() {
        super(MinecraftVersion.v1_17_1);
    }
    
    @EventHandler
    public void onEntitiesLoad(EntitiesLoadEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntitiesUnload(EntitiesUnloadEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onGenericGameEvent(GenericGameEvent e) {
        EVENT_BUS.post(e);
    }
}