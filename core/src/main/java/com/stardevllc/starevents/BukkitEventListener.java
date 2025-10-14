package com.stardevllc.starevents;

import com.stardevllc.starlib.eventbus.SubscribeEvent;
import org.bukkit.event.Event;

/**
 * Represents a listener for Bukkit Events
 * @param <E> The Event Type
 */
@SubscribeEvent
@FunctionalInterface
public interface BukkitEventListener<E extends Event> {
    /**
     * Called when a change occurs
     * @param event The event information
     */
    void onEvent(E event);
}
