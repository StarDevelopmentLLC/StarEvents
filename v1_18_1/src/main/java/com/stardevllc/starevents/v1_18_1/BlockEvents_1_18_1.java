package com.stardevllc.starevents.v1_18_1;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockDamageAbortEvent;

public class BlockEvents_1_18_1 extends EventListener {
    
    public BlockEvents_1_18_1() {
        super(MinecraftVersion.v1_18_1);
    }
    
    @EventHandler
    public void onBlockDamageAbort(BlockDamageAbortEvent e) {
        EVENT_BUS.post(e);
    }
}