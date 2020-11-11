package com.gildedrose;

public class BrieItem implements ItemContract {
    private final Item item;

    public BrieItem(Item item) {
        this.item = item;
    }

    @Override
    public void increaseQuality() {
        item.increaseQuality();
    }

    @Override
    public void decreaseQuality() {
        item.decreseQuality();
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
        if(item.underMaxQualityThreshold()){
            increaseQuality();
        }
        decreaseSellInn();
    }
}
