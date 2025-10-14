package com.stardevllc.starevents.v1_17_1;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockReceiveGameEvent;

public class BlockEvents_1_17_1 extends EventListener {
    
    public BlockEvents_1_17_1() {
        super(MinecraftVersion.v1_17_1);
    }
    
    @EventHandler
    public void onBlockReceiveGameEvent(BlockReceiveGameEvent e) {
        EVENT_BUS.post(e);
    }
}