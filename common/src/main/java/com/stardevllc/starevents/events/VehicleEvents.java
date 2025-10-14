package com.stardevllc.starevents.events;

import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.vehicle.*;

public class VehicleEvents extends EventListener {
    @EventHandler
    public void onVehicleBlockCollision(VehicleBlockCollisionEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onVehicleDamage(VehicleDamageEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onVehicleDestroy(VehicleDestroyEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onVehicleEnter(VehicleEnterEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onVehicleEntityCollision(VehicleEntityCollisionEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onVehicleExit(VehicleExitEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onVehicleMove(VehicleMoveEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onVehicleUpdate(VehicleUpdateEvent e) {
        EVENT_BUS.post(e);
    }
}