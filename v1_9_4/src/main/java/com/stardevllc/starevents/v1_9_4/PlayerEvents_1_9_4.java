package com.stardevllc.starevents.v1_9_4;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerChangedMainHandEvent;

public class PlayerEvents_1_9_4 extends EventListener {
    
    public PlayerEvents_1_9_4() {
        super(MinecraftVersion.v1_9_4);
    }
    
    @EventHandler
    public void onPlayerChangedMainHand(PlayerChangedMainHandEvent e) {
        EVENT_BUS.post(e);
    }
}