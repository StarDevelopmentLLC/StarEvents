package com.stardevllc.starevents.v1_13;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.*;

public class EntityEvents_1_13 extends EventListener {
    
    public EntityEvents_1_13() {
        super(MinecraftVersion.v1_13);
    }
    
    @EventHandler
    public void onEntityDropItem(EntityDropItemEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityPotionEffect(EntityPotionEffectEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityToggleSwim(EntityToggleSwimEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPigZombieAnger(PigZombieAngerEvent e) {
        EVENT_BUS.post(e);
    }
}