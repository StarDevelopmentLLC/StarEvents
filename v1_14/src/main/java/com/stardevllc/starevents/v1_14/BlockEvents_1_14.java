package com.stardevllc.starevents.v1_14;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.*;

public class BlockEvents_1_14 extends EventListener {
    
    public BlockEvents_1_14() {
        super(MinecraftVersion.v1_14);
    }
    
    @EventHandler
    public void onBlockCook(BlockCookEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockShearEntity(BlockShearEntityEvent e) {
        EVENT_BUS.post(e);
    }
}