package com.stardevllc.starevents.v1_8_8;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.FireworkExplodeEvent;
import org.bukkit.event.entity.ItemMergeEvent;

public class EntityEvents_1_8_8 extends EventListener {
    
    public EntityEvents_1_8_8() {
        super(MinecraftVersion.v1_8_8);
    }
    
    @EventHandler
    public void onFireworkExplode(FireworkExplodeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onItemMerge(ItemMergeEvent e) {
        EVENT_BUS.post(e);
    }
}