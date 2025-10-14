package com.stardevllc.starevents.v1_21_4;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.CrafterCraftEvent;

public class BlockEvents_1_21_4 extends EventListener {
    
    public BlockEvents_1_21_4() {
        super(MinecraftVersion.v1_21_4);
    }
    
    @EventHandler
    public void onCrafterCraft(CrafterCraftEvent e) {
        EVENT_BUS.post(e);
    }
}
