package com.stardevllc.starevents.v1_8_1_11;

import com.stardevllc.smcversion.MinecraftVersion;
import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerAchievementAwardedEvent;

public class PlayerAchievmentListener_1_8_1_11 extends EventListener {
    
    public PlayerAchievmentListener_1_8_1_11() {
        super(MinecraftVersion.v1_8, MinecraftVersion.v1_11_2);
    }
    
    @EventHandler
    public void onPlayerAchievementAwarded(PlayerAchievementAwardedEvent e) {
        EVENT_BUS.post(e);
    }
}
