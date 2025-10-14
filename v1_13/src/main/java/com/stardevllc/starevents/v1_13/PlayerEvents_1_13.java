package com.stardevllc.starevents.v1_13;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerCommandSendEvent;
import org.bukkit.event.player.PlayerRiptideEvent;

public class PlayerEvents_1_13 extends EventListener {
    
    public PlayerEvents_1_13() {
        super(MinecraftVersion.v1_13);
    }
    
    @EventHandler
    public void onPlayerCommandSend(PlayerCommandSendEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerRiptide(PlayerRiptideEvent e) {
        EVENT_BUS.post(e);
    }
}