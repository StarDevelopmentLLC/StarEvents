package com.stardevllc.starevents.v1_21_1;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.*;

public class PlayerEvents_1_21_1 extends EventListener {
    
    public PlayerEvents_1_21_1() {
        super(MinecraftVersion.v1_21_1);
    }
    
    @EventHandler
    public void onPlayerExpCooldownChange(PlayerExpCooldownChangeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerLinksSend(PlayerLinksSendEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerSignOpen(PlayerSignOpenEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerSpawnChange(PlayerSpawnChangeEvent e) {
        EVENT_BUS.post(e);
    }
}