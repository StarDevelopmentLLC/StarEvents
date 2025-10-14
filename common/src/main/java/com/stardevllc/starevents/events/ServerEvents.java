package com.stardevllc.starevents.events;

import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.server.*;

public class ServerEvents extends EventListener {
    @EventHandler
    public void onMapInit(MapInitializeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPluginDisable(PluginDisableEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPluginEnable(PluginEnableEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onRemoteSErverCommand(RemoteServerCommandEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onServerListPing(ServerListPingEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onServiceRegister(ServiceRegisterEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onServiceUnregister(ServiceUnregisterEvent e) {
        EVENT_BUS.post(e);
    }
}