package com.stardevllc.starevents.v1_13_2;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.*;

public class BlockEvents_1_13_2 extends EventListener {
    
    public BlockEvents_1_13_2() {
        super(MinecraftVersion.v1_13_2);
    }
    
    @EventHandler
    public void onBlockDispenseArmor(BlockDispenseArmorEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onMoistureChange(MoistureChangeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onFluidLevelChange(FluidLevelChangeEvent e) {
        EVENT_BUS.post(e);
    }
}