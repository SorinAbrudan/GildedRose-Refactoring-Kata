package com.gildedrose;

import java.util.StringJoiner;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!item.name().equals("Aged Brie")
                    && !item.name().equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.quality() > 0) {
                    if (!item.name().equals("Sulfuras, Hand of Ragnaros")) {
                        item.decreseQuality();
                    }
                }
            } else {
                if (item.quality() < 50) {
                    item.increaseQuality();

                    if (item.name().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.sellIn() < 11) {
                            if (item.quality() < 50) {
                                item.increaseQuality();
                            }
                        }

                        if (item.sellIn() < 6) {
                            if (item.quality() < 50) {
                                item.increaseQuality();
                            }
                        }
                    }
                }
            }

            if (!item.name().equals("Sulfuras, Hand of Ragnaros")) {
                item.decreseSellIn();
            }

            if (item.sellIn() < 0) {
                if (!item.name().equals("Aged Brie")) {
                    if (!item.name().equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.quality() > 0) {
                            if (!item.name().equals("Sulfuras, Hand of Ragnaros")) {
                                item.decreseQuality();
                            }
                        }
                    } else {
                        item.resetQuality();
                    }
                } else {
                    if (item.quality() < 50) {
                        item.increaseQuality();
                    }
                }
            }
        }
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