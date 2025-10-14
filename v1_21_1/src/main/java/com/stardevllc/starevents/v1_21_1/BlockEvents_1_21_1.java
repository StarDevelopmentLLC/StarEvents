package com.stardevllc.starevents.v1_21_1;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.*;

public class BlockEvents_1_21_1 extends EventListener {
    
    public BlockEvents_1_21_1() {
        super(MinecraftVersion.v1_21_1);
    }
    
    @EventHandler
    public void onBlockDispenseLoot(BlockDispenseLootEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onCrafterCraft(CrafterCraftEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onVaultDisplayItem(VaultDisplayItemEvent e) {
        EVENT_BUS.post(e);
    }
}