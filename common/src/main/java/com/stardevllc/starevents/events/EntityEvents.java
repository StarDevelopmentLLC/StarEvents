package com.stardevllc.starevents.events;

import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.*;

public class EntityEvents extends EventListener {
    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onCreeperPower(CreeperPowerEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityBreakDoor(EntityBreakDoorEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityChangeBlock(EntityChangeBlockEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityCombustByBlock(EntityCombustByBlockEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityCombustByEntity(EntityCombustByEntityEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityDamageByBlock(EntityDamageByBlockEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityDamage(EntityDamageEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityDeath(EntityDeathEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityExplode(EntityExplodeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityInteract(EntityInteractEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityPortalEnter(EntityPortalEnterEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityPortal(EntityPortalEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityPortalExit(EntityPortalExitEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityRegainHealth(EntityRegainHealthEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityShootBow(EntityShootBowEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityTame(EntityTameEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityTarget(EntityTargetEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityTargetLivingEntity(EntityTargetLivingEntityEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityTeleport(EntityTeleportEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityUnleash(EntityUnleashEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onExplosionPrime(ExplosionPrimeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onFoodLevelChange(FoodLevelChangeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onHorseJump(HorseJumpEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onItemDespawn(ItemDespawnEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onItemSpawn(ItemSpawnEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPigZap(PigZapEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPlayerLeashEntity(PlayerLeashEntityEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPotionSplash(PotionSplashEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onProjectileHit(ProjectileHitEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onProjectileLaunch(ProjectileLaunchEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onSheepDyeWool(SheepDyeWoolEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onSheepRegrowWool(SheepRegrowWoolEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onSlimeSplit(SlimeSplitEvent e) {
        EVENT_BUS.post(e);
    }
}