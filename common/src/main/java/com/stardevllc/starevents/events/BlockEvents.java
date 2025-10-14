package com.stardevllc.starevents.events;

import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.*;

public class BlockEvents extends EventListener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockBurn(BlockBurnEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockCanBuild(BlockCanBuildEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockDamage(BlockDamageEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockDispense(BlockDispenseEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockExp(BlockExpEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockFade(BlockFadeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockForm(BlockFormEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockFromTo(BlockFromToEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockGrow(BlockGrowEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockIgnite(BlockIgniteEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockMultiPlace(BlockMultiPlaceEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockPhysics(BlockPhysicsEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockPistonExtend(BlockPistonExtendEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockPistonRetract(BlockPistonRetractEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockRedstone(BlockRedstoneEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onBlockSpread(BlockSpreadEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onEntityBlockForm(EntityBlockFormEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onLeavesDecayEvent(LeavesDecayEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onNotePlateEvent(NotePlayEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onSignChange(SignChangeEvent e) {
        EVENT_BUS.post(e);
    }
}