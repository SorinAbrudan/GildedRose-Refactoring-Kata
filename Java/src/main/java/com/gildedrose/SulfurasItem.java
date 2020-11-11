package com.gildedrose;

public class SulfurasItem implements ItemContract {
    private final Item item;

    public SulfurasItem(Item item) {
        this.item = item;
    }

    @Override
    public void increaseQuality() {
    }

    @Override
    public void decreaseQuality() {
    }

    @Override
    public void decreaseSellInn() {
    }

    @Override
    public void resetQuality() {
    }

    @Override
    public void update() {
    }
}
