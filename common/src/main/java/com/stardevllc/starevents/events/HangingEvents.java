package com.stardevllc.starevents.events;

import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.hanging.*;

public class HangingEvents extends EventListener {
    @EventHandler
    public void onHangingBreakByEntity(HangingBreakByEntityEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onHangingBreak(HangingBreakEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onHangingPlace(HangingPlaceEvent e) {
        EVENT_BUS.post(e);
    }
}