package com.stardevllc.starevents;

import com.stardevllc.starlib.eventbus.impl.SimpleEventBus;
import org.bukkit.event.Event;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CustomBus extends SimpleEventBus<Event> {
    
    private final Map<Event, Instant> recentEvents = new ConcurrentHashMap<>();
    
    public CustomBus() {
        super(Event.class);
        
        Thread.ofVirtual().start(() -> {
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {}
            
            Instant now = Instant.now();
            new HashMap<>(recentEvents).forEach((event, expire) -> {
                if (now.isAfter(expire)) {
                    recentEvents.remove(event);
                }
            });
        });
    }
    
    @Override
    public <E extends Event> E post(E event) {
        if (recentEvents.containsKey(event)) {
            return event;
        }
        
        Instant currentTime = Instant.now();
        recentEvents.put(event, currentTime.plusSeconds(1));
        return super.post(event);
    }
}