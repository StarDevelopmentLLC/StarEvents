package com.stardevllc.starevents;

import com.stardevllc.starevents.events.*;
import com.stardevllc.starevents.v1_10_2.EntityEvents_1_10_2;
import com.stardevllc.starevents.v1_11_2.EntityEvents_1_11_2;
import com.stardevllc.starevents.v1_11_2.InventoryEvents_1_11_2;
import com.stardevllc.starevents.v1_12_2.*;
import com.stardevllc.starevents.v1_13.*;
import com.stardevllc.starevents.v1_13_2.*;
import com.stardevllc.starevents.v1_14.*;
import com.stardevllc.starevents.v1_14_1.EntityEvents_1_14_1;
import com.stardevllc.starevents.v1_14_4.BlockEvents_1_14_4;
import com.stardevllc.starevents.v1_14_4.RaidEvents_1_14_4;
import com.stardevllc.starevents.v1_15_2.EntityEvents_1_15_2;
import com.stardevllc.starevents.v1_15_2.WorldEvents_1_15_2;
import com.stardevllc.starevents.v1_16_1.*;
import com.stardevllc.starevents.v1_16_3.EntityEvents_1_16_3;
import com.stardevllc.starevents.v1_16_5.EntityEvents_1_16_5;
import com.stardevllc.starevents.v1_17_1.*;
import com.stardevllc.starevents.v1_18_1.BlockEvents_1_18_1;
import com.stardevllc.starevents.v1_19_3.InventoryEvents_1_19_3;
import com.stardevllc.starevents.v1_20_1.EntityEvents_1_20_1;
import com.stardevllc.starevents.v1_21_1.EntityEvents_1_21_1;
import com.stardevllc.starevents.v1_21_1.PlayerEvents_1_21_1;
import com.stardevllc.starevents.v1_21_4.BlockEvents_1_21_4;
import com.stardevllc.starevents.v1_21_4.EntityEvents_1_21_4;
import com.stardevllc.starevents.v1_21_7.EntityEvents_1_21_7;
import com.stardevllc.starevents.v1_8_1_11.PlayerAchievmentListener_1_8_1_11;
import com.stardevllc.starevents.v1_8_1_11.PlayerItemPickupListener_1_8_1_11;
import com.stardevllc.starevents.v1_8_1_13_2.EntityCreatePortalListener_1_8_1_13_2;
import com.stardevllc.starevents.v1_8_3.BlockEvents_1_8_3;
import com.stardevllc.starevents.v1_8_8.EntityEvents_1_8_8;
import com.stardevllc.starevents.v1_8_8.PlayerEvents_1_8_8;
import com.stardevllc.starevents.v1_9_4.PlayerEvents_1_9_4;
import com.stardevllc.starevents.v1_9_4.ServerEvents_1_9_4;
import com.stardevllc.starlib.helper.Pair;
import com.stardevllc.starlib.helper.ReflectionHelper;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Method;
import java.util.*;

public final class StarEvents {
    private StarEvents() {
    }
    
    private static JavaPlugin plugin;
    
    private static final List<EventListener> succesfulListeners = new ArrayList<>();
    private static final Map<EventListener, Throwable> failedListeners = new HashMap<>();
    private static final List<EventListener> outOfRangeListeners = new ArrayList<>();
    
    private static final Map<Class<? extends Event>, Pair<Object, Method>> eventsTracked = new HashMap<>();
    
    public static void registerListener(Object listener) {
        EventListener.EVENT_BUS.subscribe(listener);
    }
    
    public static <E extends Event> void registerListener(Class<E> eventType, BukkitEventListener<E> listener) {
        EventListener.EVENT_BUS.subscribe(listener);
    }
    
    public static <E extends Event> void unregisterListener(BukkitEventListener<?> listener) {
        EventListener.EVENT_BUS.unsubscribe(listener);
    }
    
    public static void init(JavaPlugin plugin) {
        if (StarEvents.plugin != null) {
            plugin.getLogger().severe("StarEvents has already been initialized by " + StarEvents.plugin.getName());
            return;
        }
        
        StarEvents.plugin = plugin;
        
        List<EventListener> listeners = List.of(
                new BlockEvents(),
                new EnchantEvents(),
                new EntityEvents(),
                new HangingEvents(),
                new InventoryEvents(),
                new PlayerEvents(),
                new ServerEvents(),
                new VehicleEvents(),
                new WeatherEvents(),
                new WorldEvents(),
                new PlayerAchievmentListener_1_8_1_11(),
                new PlayerItemPickupListener_1_8_1_11(),
                new EntityCreatePortalListener_1_8_1_13_2(),
                new BlockEvents_1_8_3(),
                new EntityEvents_1_8_8(),
                new PlayerEvents_1_8_8(),
                new PlayerEvents_1_9_4(),
                new ServerEvents_1_9_4(),
                new EntityEvents_1_10_2(),
                new EntityEvents_1_11_2(),
                new InventoryEvents_1_11_2(),
                new EntityEvents_1_12_2(),
                new PlayerEvents_1_12_2(),
                new ServerEvents_1_12_2(),
                new BlockEvents_1_13(),
                new EntityEvents_1_13(),
                new PlayerEvents_1_13(),
                new BlockEvents_1_13_2(),
                new EntityEvents_1_13_2(),
                new PlayerEvents_1_13_2(),
                new ServerEvents_1_13_2(),
                new BlockEvents_1_14(),
                new EntityEvents_1_14(),
                new InventoryEvents_1_14(),
                new PlayerEvents_1_14(),
                new EntityEvents_1_14_1(),
                new BlockEvents_1_14_4(),
                new RaidEvents_1_14_4(),
                new EntityEvents_1_15_2(),
                new WorldEvents_1_15_2(),
                new EntityEvents_1_16_1(),
                new InventoryEvents_1_16_1(),
                new PlayerEvents_1_16_1(),
                new EntityEvents_1_16_3(),
                new EntityEvents_1_16_5(),
                new BlockEvents_1_17_1(),
                new InventoryEvents_1_17_1(),
                new WorldEvents_1_17_1(),
                new BlockEvents_1_18_1(),
                new InventoryEvents_1_19_3(),
                new EntityEvents_1_20_1(),
                new EntityEvents_1_21_1(),
                new PlayerEvents_1_21_1(),
                new BlockEvents_1_21_4(),
                new EntityEvents_1_21_4(),
                new EntityEvents_1_21_7()
        );
        
        for (EventListener listener : listeners) {
            addEventListener(listener);
        }
        
        try {
            Class.forName("com.stardevllc.starmclib.StarMCLib");
            StarMCLibIntegration.init();
        } catch (Throwable t) {}
    }
    
    public enum Status {
        SUCCESS, FAIL, OUT_OF_RANGE, NULL
    }
    
    public static Status addEventListener(EventListener listener) {
        if (listener == null) {
            return Status.NULL;
        }
        
        if (!listener.isAvailable()) {
            outOfRangeListeners.add(listener);
            return Status.OUT_OF_RANGE;
        }
        
        try {
            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
            
            Set<Method> methods = ReflectionHelper.getClassMethods(listener.getClass());
            for (Method method : methods) {
                if (!method.isAnnotationPresent(EventHandler.class)) {
                    continue;
                }
                
                if (method.getParameterCount() != 1) {
                    continue;
                }
                
                Class<?> paramType = method.getParameterTypes()[0];
                if (Event.class.isAssignableFrom(paramType)) {
                    if (eventsTracked.containsKey(paramType)) {
                        plugin.getLogger().warning("Event " + paramType.getName() + " has duplicate listeners");
                        plugin.getLogger().warning("  - " + listener.getClass().getName());
                        
                        Pair<Object, Method> info = eventsTracked.get(paramType);
                        plugin.getLogger().warning("  - " + info.first().getClass().getName());
                    } else {
                        eventsTracked.put((Class<? extends Event>) paramType, new Pair<>(listener.getClass(), method));
                    }
                }
            }
            
            succesfulListeners.add(listener);
            return Status.SUCCESS;
        } catch (Throwable t) {
            failedListeners.put(listener, t);
            return Status.FAIL;
        }
    }
    
    public static JavaPlugin getPlugin() {
        return plugin;
    }
    
    public static List<EventListener> getSuccesfulListeners() {
        return new ArrayList<>(succesfulListeners);
    }
    
    public static Map<EventListener, Throwable> getFailedListeners() {
        return new HashMap<>(failedListeners);
    }
    
    public static List<EventListener> getOutOfRangeListeners() {
        return new ArrayList<>(outOfRangeListeners);
    }
    
    public static Map<Class<? extends Event>, Pair<Object, Method>> getEventsTracked() {
        return new HashMap<>(eventsTracked);
    }
}