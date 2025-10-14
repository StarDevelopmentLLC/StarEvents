package com.stardevllc.starevents.events;

import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;

public class EnchantEvents extends EventListener {
    @EventHandler
    public void onEnchantItem(EnchantItemEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPrepareItemEnchant(PrepareItemEnchantEvent e) {
        EVENT_BUS.post(e);
    }
}
