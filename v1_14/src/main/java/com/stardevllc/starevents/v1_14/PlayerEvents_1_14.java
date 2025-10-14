package com.stardevllc.starevents.v1_14;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerTakeLecternBookEvent;

public class PlayerEvents_1_14 extends EventListener {
    
    public PlayerEvents_1_14() {
        super(MinecraftVersion.v1_14);
    }
    
    @EventHandler
    public void onPlayerTakeLecturnBook(PlayerTakeLecternBookEvent e) {
        EVENT_BUS.post(e);
    }
}