package com.stardevllc.starevents.events;

import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.weather.*;

public class WeatherEvents extends EventListener {
    @EventHandler
    public void onLightningStrike(LightningStrikeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onThunderChange(ThunderChangeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onWeatherChange(WeatherChangeEvent e) {
        EVENT_BUS.post(e);
    }
}