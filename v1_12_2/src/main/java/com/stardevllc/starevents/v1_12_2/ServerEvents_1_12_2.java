package com.stardevllc.starevents.v1_12_2;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.server.BroadcastMessageEvent;

public class ServerEvents_1_12_2 extends EventListener {
    
    public ServerEvents_1_12_2() {
        super(MinecraftVersion.v1_12_2);
    }
    
    @EventHandler
    public void onBroadcastMessage(BroadcastMessageEvent e) {
        EVENT_BUS.post(e);
    }
}