package com.stardevllc.starevents;

import com.stardevllc.starlib.eventbus.impl.SimpleEventBus;
import org.bukkit.event.Event;

import java.util.HashMap;
import java.util.Map;

public class CustomBus extends SimpleEventBus<Event> {
    
    private final Map<Event, Long> recentEvents = new HashMap<>();
    
    public CustomBus() {
        super(Event.class);
    }
    
    @Override
    public <E extends Event> E post(E event) {
        //Remove the event instance after 1 second
        recentEvents.entrySet().removeIf(entry -> System.currentTimeMillis() >= entry.getValue() + 1000L);
        
        if (recentEvents.containsKey(event)) {
            return event;
        }
        
        recentEvents.put(event, System.currentTimeMillis());
        return super.post(event);
    }
}