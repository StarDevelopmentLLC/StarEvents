package com.stardevllc.starevents.v1_21_7;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerLinksSendEvent;

public class PlayerEvents_1_21_7 extends EventListener {
    
    public PlayerEvents_1_21_7() {
        super(MinecraftVersion.v1_21_7);
    }
    
    @EventHandler
    public void onPlayerLinksSend(PlayerLinksSendEvent e) {
        EVENT_BUS.post(e);
    }
}