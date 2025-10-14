package com.stardevllc.starevents.v1_8_3;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockExplodeEvent;

public class BlockEvents_1_8_3 extends EventListener {
    
    public BlockEvents_1_8_3() {
        super(MinecraftVersion.v1_8_3);
    }
    
    @EventHandler
    public void onBlockExplode(BlockExplodeEvent e) {
        EVENT_BUS.post(e);
    }
}