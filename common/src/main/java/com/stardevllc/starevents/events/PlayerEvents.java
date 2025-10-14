package com.stardevllc.starevents.events;

import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.*;

public class PlayerEvents extends EventListener {
    @EventHandler
    public void onAsyncPlayerChat(AsyncPlayerChatEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onAsyncPlayerPreLogin(AsyncPlayerPreLoginEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerAnimation(PlayerAnimationEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerArmorStandManipulate(PlayerArmorStandManipulateEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerBedEnter(PlayerBedEnterEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerBedLeave(PlayerBedLeaveEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerBucketEmpty(PlayerBucketEmptyEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerBucketFill(PlayerBucketFillEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerChangedWorld(PlayerChangedWorldEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerChannel(PlayerChannelEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerChatTabComplete(PlayerChatTabCompleteEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerDropItemEvent(PlayerDropItemEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerEditBook(PlayerEditBookEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerEggThrow(PlayerEggThrowEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerExpChange(PlayerExpChangeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerFish(PlayerFishEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerGameModeChange(PlayerGameModeChangeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerInteractAtEntity(PlayerInteractAtEntityEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerInteractEntity(PlayerInteractEntityEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerItemBreak(PlayerItemBreakEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerItemConsume(PlayerItemConsumeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerItemHeld(PlayerItemHeldEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerKick(PlayerKickEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerLevelChange(PlayerLevelChangeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerPortal(PlayerPortalEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerRegisterChannel(PlayerRegisterChannelEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerRespawn(PlayerRespawnEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerShearEntity(PlayerShearEntityEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerStatisticIncrement(PlayerStatisticIncrementEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerTeleport(PlayerTeleportEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerToggleFlight(PlayerToggleFlightEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerToggleSneak(PlayerToggleSneakEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerToggleSprint(PlayerToggleSprintEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerUnleashEntity(PlayerUnleashEntityEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerUnregisterChannel(PlayerUnregisterChannelEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerVelocity(PlayerVelocityEvent e) {
        EVENT_BUS.post(e);
    }
}