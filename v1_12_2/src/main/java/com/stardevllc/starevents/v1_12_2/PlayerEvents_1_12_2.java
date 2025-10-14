package com.stardevllc.starevents.v1_12_2;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.*;

public class PlayerEvents_1_12_2 extends EventListener {
    
    public PlayerEvents_1_12_2() {
        super(MinecraftVersion.v1_12_2);
    }
    
    @EventHandler
    public void onPlayerItemMend(PlayerItemMendEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerAdvancementDone(PlayerAdvancementDoneEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerLocaleChangeEvent(PlayerLocaleChangeEvent e) {
        EVENT_BUS.post(e);
    }
}