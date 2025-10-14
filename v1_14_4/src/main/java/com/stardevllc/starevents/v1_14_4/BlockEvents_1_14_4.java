package com.stardevllc.starevents.v1_14_4;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockDropItemEvent;

public class BlockEvents_1_14_4 extends EventListener {
    
    public BlockEvents_1_14_4() {
        super(MinecraftVersion.v1_14_4);
    }
    
    @EventHandler
    public void onBlockDropItem(BlockDropItemEvent e) {
        EVENT_BUS.post(e);
    }
}