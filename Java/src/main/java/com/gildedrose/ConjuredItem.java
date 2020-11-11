package com.gildedrose;

public class ConjuredItem implements ItemContract {
    private final Item item;

    public ConjuredItem(Item item) {
        this.item = item;
    }

    @Override
    public void increaseQuality() {
        item.increaseQuality();
    }

    @Override
    public void decreaseQuality() {
        item.decreseQuality();
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
        if(item.aboveMinQualityThreshold()){
            decreaseQuality();
        }
        decreaseSellInn();
    }
}
