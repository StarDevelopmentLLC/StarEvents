package com.stardevllc.starevents.v1_8_1_11;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class PlayerItemPickupListener_1_8_1_11 extends EventListener {
    
    public PlayerItemPickupListener_1_8_1_11() {
        super(MinecraftVersion.v1_8, MinecraftVersion.v1_11);
    }
    
    @EventHandler
    public void onPlayerItemPickup(PlayerPickupItemEvent e) {
        EVENT_BUS.post(e);
    }
}