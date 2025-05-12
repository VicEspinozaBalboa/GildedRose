package edu.alenasoft;

public class BackstagePassesUpdater implements ItemUpdater{

    @Override
    public void update(Item item) {
        item.sellIn--;

        if (item.sellIn < 0) {
            item.quality = 0;
        } else {
            if (item.quality < 50) item.quality++;
            if (item.sellIn < 10 && item.quality < 50) item.quality++;
            if (item.sellIn < 5 && item.quality < 50) item.quality++;
        }
    }

}
