package com.stardevllc.starevents.v1_16_5;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerBucketEntityEvent;

public class PlayerEvents_1_16_5 extends EventListener {
    
    public PlayerEvents_1_16_5() {
        super(MinecraftVersion.v1_16_5);
    }
    
    @EventHandler
    public void onPlayerBucketEntity(PlayerBucketEntityEvent e) {
        EVENT_BUS.post(e);
    }
}