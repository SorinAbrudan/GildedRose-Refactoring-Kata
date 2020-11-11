package com.gildedrose;

public class RegularItem implements ItemContract {
    private final Item item;

    public RegularItem(Item item) {
        this.item = item;
    }

    @Override
    public void increaseQuality() {
        item.increaseQuality();
    }

    @Override
    public void decreaseQuality() {
        if(item.aboveMinQualityThreshold()){
            item.decreseQuality();
        } else {
            resetQuality();
        }

    }

    @Override
    public void decreaseSellInn() {
        item.decreseSellIn();
    }

    @Override
    public void resetQuality() {
        item.resetQuality();
    }

    @Override
    public void update() {
        if(item.aboveMinQualityThreshold()){
            decreaseQuality();
        } else {
            decreaseQuality();
            decreaseQuality();
        }
        decreaseSellInn();
    }
}
