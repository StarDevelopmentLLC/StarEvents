package com.stardevllc.starevents.events;

import com.stardevllc.starevents.EventListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.*;

public class InventoryEvents extends EventListener {
    @EventHandler
    public void onBrewEvent(BrewEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onCraftItem(CraftItemEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onFurnaceBurn(FurnaceBurnEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onFurnaceExtract(FurnaceExtractEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onFurnaceSmelt(FurnaceSmeltEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onInventory(InventoryEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onInventoryClose(InventoryCloseEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onInventoryCreative(InventoryCreativeEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onInventoryDrag(InventoryDragEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onInventoryInteract(InventoryInteractEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onInventoryMoveItem(InventoryMoveItemEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onInventoryPickupItem(InventoryPickupItemEvent e) {
        EVENT_BUS.post(e);
    }
    
    @EventHandler
    public void onPrepareItemCraft(PrepareItemCraftEvent e) {
        EVENT_BUS.post(e);
    }
}