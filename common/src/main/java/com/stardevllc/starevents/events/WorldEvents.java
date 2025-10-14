package com.stardevllc.starevents.events;

import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.world.*;

public class WorldEvents extends EventListener {
    @EventHandler
    public void onChunkLoad(ChunkLoadEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onChunkPopulate(ChunkPopulateEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onChunkUnload(ChunkLoadEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPortalCreate(PortalCreateEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onSpawnChange(SpawnChangeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onStructureGrow(StructureGrowEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onWorldInit(WorldInitEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onWorldLoad(WorldLoadEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onWorldSave(WorldSaveEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onWorldUnload(WorldUnloadEvent e) {
        EVENT_BUS.post(e);
    }
}