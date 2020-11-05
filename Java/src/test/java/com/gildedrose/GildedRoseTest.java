package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    private GildedRose gildedRose;
    private GildedRose newGildedRose;

    void init(){
        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        Item[] newItems = new Item[] {
                new Item("+5 Dexterity Vest", -19, 0), //
                new Item("Aged Brie", -27, 50), //
                new Item("Elixir of the Mongoose", -24, 0), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", -14, 0),
                new Item("Backstage passes to a TAFKAL80ETC concert", -19, 0),
                new Item("Backstage passes to a TAFKAL80ETC concert", -24, 0),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", -26, 0) };

        gildedRose = new GildedRose(items);
        newGildedRose = new GildedRose(newItems);
    }

    @Test
    void thirtyDaysTest() {
      init();
      for (int i=0; i<29; i++) {
          gildedRose.updateQuality();
      }

      assertEquals(gildedRose.toString(), newGildedRose.toString());
    }

}
