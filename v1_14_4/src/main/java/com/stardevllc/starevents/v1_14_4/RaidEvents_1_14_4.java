package com.stardevllc.starevents.v1_14_4;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.raid.*;

public class RaidEvents_1_14_4 extends EventListener {
    
    public RaidEvents_1_14_4() {
        super(MinecraftVersion.v1_14_4);
    }
    
    @EventHandler
    public void onRaidFinish(RaidFinishEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onRaidSpawnWave(RaidSpawnWaveEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onRaidStop(RaidStopEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onRaidTrigger(RaidTriggerEvent e) {
        EVENT_BUS.post(e);
    }
}