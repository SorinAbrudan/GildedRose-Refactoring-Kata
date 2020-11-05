package com.gildedrose;

public class Item {

    private final String name;

    private int sellIn;

    private int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String name() {
        return name;
    }

    public int quality() {
        return quality;
    }

    public int sellIn() {
        return sellIn;
    }

    public void decreseSellIn(){
       sellIn -= 1;
    }

    public void decreseQuality(){
        quality -= 1;
    }

    public void increaseQuality(){
        quality += 1;
    }

    public void resetQuality(){
        quality = 0;
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
