package com.stardevllc.starevents.v1_13_2;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.event.player.PlayerRecipeDiscoverEvent;

public class PlayerEvents_1_13_2 extends EventListener {
    
    public PlayerEvents_1_13_2() {
        super(MinecraftVersion.v1_13_2);
    }
    
    @EventHandler
    public void onPlayerRecipeDiscover(PlayerRecipeDiscoverEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerItemDamage(PlayerItemDamageEvent e) {
        EVENT_BUS.post(e);
    }
}