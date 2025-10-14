package com.stardevllc.starevents;

import com.stardevllc.starmclib.StarMCLib;

public final class StarMCLibIntegration {
    public static void init() {
        EventListener.EVENT_BUS.addChildBus(StarMCLib.GLOBAL_BUKKIT_EVENT_BUS);
    }
}