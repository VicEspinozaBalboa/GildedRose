package edu.alenasoft;

import java.util.HashMap;
import java.util.Map;

public class ItemUpdaterFactory {
 private static final Map<String, ItemUpdater> updaters = new HashMap<>();

    static {
        updaters.put("Aged Brie", new AgedBrieUpdater());
        updaters.put("Backstage passes", new BackstagePassesUpdater());
        updaters.put("Sulfuras", new SulfurasUpdater());
    }

    public static ItemUpdater getUpdater(Item item) {
        return updaters.getOrDefault(item.name, new NormalItemUpdater());
    }
}
