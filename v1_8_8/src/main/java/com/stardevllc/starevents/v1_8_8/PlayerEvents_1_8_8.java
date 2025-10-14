package com.stardevllc.starevents.v1_8_8;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;

public class PlayerEvents_1_8_8 extends EventListener {
    
    public PlayerEvents_1_8_8() {
        super(MinecraftVersion.v1_8_8);
    }
    
    @EventHandler
    public void onPlayerResourcePackStatus(PlayerResourcePackStatusEvent e) {
        EVENT_BUS.post(e);
    }
}