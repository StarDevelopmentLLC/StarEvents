package com.stardevllc.starevents.v1_13;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockFertilizeEvent;
import org.bukkit.event.block.SpongeAbsorbEvent;

public class BlockEvents_1_13 extends EventListener {
    
    public BlockEvents_1_13() {
        super(MinecraftVersion.v1_13);
    }
    
    @EventHandler
    public void onBlockFertilize(BlockFertilizeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onSpongeAbsorb(SpongeAbsorbEvent e) {
        EVENT_BUS.post(e);
    }
}