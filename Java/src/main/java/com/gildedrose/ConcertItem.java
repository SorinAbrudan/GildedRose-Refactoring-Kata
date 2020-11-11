package com.gildedrose;

public class ConcertItem implements ItemContract {
    private final Item item;

    public ConcertItem(Item item) {
        this.item = item;
    }

    @Override
    public void increaseQuality() {
        if(item.underMaxQualityThreshold()){
            item.increaseQuality();
        }
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
        if(item.aboveMinSellInnThreshold()){
            increaseQuality();
            if(item.sellIn() < 11) {
                increaseQuality();
            }
            if(item.sellIn() < 5) {
                increaseQuality();
            }
        } else {
            resetQuality();
        }
        decreaseSellInn();
    }
}
