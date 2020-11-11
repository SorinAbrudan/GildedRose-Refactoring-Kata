package com.gildedrose;

import java.util.Arrays;
import java.util.StringJoiner;

public class GildedRose {
    private final Item[] items;
    private final ItemFactory itemFactory;

    public GildedRose(Item[] items) {
        this.items = items;
        this.itemFactory = new ItemFactory();
    }

    public void updateQuality() {
        Arrays.stream(items).map(itemFactory::getItem).forEach(ItemContract::update);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        for (Item item : items) {
            joiner.add(item.toString());
        }
        return joiner.toString();
    }
}