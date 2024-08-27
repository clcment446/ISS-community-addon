package com.c446.ironbound_core.util;

import com.c446.ironbound_core.config.IronboundCoreConfig;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraftforge.common.ForgeConfigSpec;

import java.util.HashMap;

public abstract class ItemAttributeHelper {
    public static HashMap<Attribute, Double> handleConfig(HashMap<Attribute, ForgeConfigSpec.DoubleValue> configMap, HashMap<Attribute, Double> defaultMap) {
        HashMap<Attribute, Double> finalMap = new HashMap<>();
        if (IronboundCoreConfig.SERVER_CONFIG.isLoaded()) {
            for (Attribute a : configMap.keySet()) {
                finalMap.put(a, configMap.get(a).get());
            }
        } else {
            for (Attribute a : defaultMap.keySet()) {
                finalMap.put(a, defaultMap.get(a));
            }
        }
        return null;
    }
}
