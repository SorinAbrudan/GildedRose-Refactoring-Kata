package com.gildedrose;

public enum ItemEnum {
    VEST("+5 Dexterity Vest"),
    ELIXIR("Elixir of the Mongoose"),
    SULFURAS("Sulfuras, Hand of Ragnaros"),
    CONCERT("Backstage passes to a TAFKAL80ETC concert"),
    CONJURED("Conjured Mana Cake"),
    BRIE("Aged Brie");

    private final String name;

    ItemEnum(String name) {
        this.name = name;
    }

    public static ItemEnum valueOfName(String itemName) {
        for (ItemEnum e : values()) {
            if (e.name.equals(itemName)) {
                return e;
            }
        }
        return null;
    }
}
