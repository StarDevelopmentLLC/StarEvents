package com.stardevllc.starevents.v1_9_4;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.server.TabCompleteEvent;

public class ServerEvents_1_9_4 extends EventListener {
    
    public ServerEvents_1_9_4() {
        super(MinecraftVersion.v1_9_4);
    }
    
    @EventHandler
    public void onTabComplete(TabCompleteEvent e) {
        EVENT_BUS.post(e);
    }
}