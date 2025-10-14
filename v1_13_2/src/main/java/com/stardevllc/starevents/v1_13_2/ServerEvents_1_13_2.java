package com.stardevllc.starevents.v1_13_2;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.server.ServerLoadEvent;

public class ServerEvents_1_13_2 extends EventListener {
    
    public ServerEvents_1_13_2() {
        super(MinecraftVersion.v1_13_2);
    }
    
    @EventHandler
    public void onServerLoad(ServerLoadEvent e) {
        EVENT_BUS.post(e);
    }
}