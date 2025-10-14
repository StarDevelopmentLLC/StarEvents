package com.stardevllc.starevents.v1_16_1;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerHarvestBlockEvent;

public class PlayerEvents_1_16_1 extends EventListener {
    
    public PlayerEvents_1_16_1() {
        super(MinecraftVersion.v1_16_1);
    }
    
    @EventHandler
    public void onPlayerHarvestBlock(PlayerHarvestBlockEvent e) {
        EVENT_BUS.post(e);
    }
}