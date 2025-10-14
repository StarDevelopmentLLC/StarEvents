package com.stardevllc.starevents;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starlib.eventbus.IEventBus;
import org.bukkit.event.Event;
import org.bukkit.event.Listener;

public class EventListener implements Listener {
    public static final IEventBus<Event> EVENT_BUS = new CustomBus();
    
    protected MinecraftVersion minVersion, maxVersion;
    
    public EventListener() {
    }
    
    public EventListener(MinecraftVersion minVersion, MinecraftVersion maxVersion) {
        this.minVersion = minVersion;
        this.maxVersion = maxVersion;
    }
    
    public EventListener(MinecraftVersion minVersion) {
        this.minVersion = minVersion;
    }
    
    public boolean isAvailable() {
        boolean minInRange;
        if (minVersion != null) {
            minInRange = MinecraftVersion.CURRENT_VERSION.ordinal() >= minVersion.ordinal();
        } else {
            minInRange = true;
        }
        
        boolean maxInRange;
        if (maxVersion != null) {
            maxInRange = MinecraftVersion.CURRENT_VERSION.ordinal() <= maxVersion.ordinal();
        } else {
            maxInRange = true;
        }
        
        return minInRange && maxInRange;
    }
}