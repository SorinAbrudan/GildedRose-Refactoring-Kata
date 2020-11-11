package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    private GildedRose gildedRose;

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

        gildedRose = new GildedRose(items);
    }

    @Test
    void oneDaysTest() {
        //given
        init();
        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 9, 19), //
                new Item("Aged Brie", 1, 1), //
                new Item("Elixir of the Mongoose", 4, 6), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21),
                new Item("Backstage passes to a TAFKAL80ETC concert", 9, 50),
                new Item("Backstage passes to a TAFKAL80ETC concert", 4, 50),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 2, 4) };
        GildedRose newGildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(gildedRose.toString(), newGildedRose.toString());
    }

    @Test
    void thirtyDaysTest() {
        //given
        init();
        Item[] newItems = new Item[] {
                new Item("+5 Dexterity Vest", -19, 0), //
                new Item("Aged Brie", -27, 29), //
                new Item("Elixir of the Mongoose", -24, 0), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", -14, 0),
                new Item("Backstage passes to a TAFKAL80ETC concert", -19, 0),
                new Item("Backstage passes to a TAFKAL80ETC concert", -24, 0),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", -26, 0) };
        GildedRose newGildedRose = new GildedRose(newItems);

      for (int i=0; i<29; i++) {
          gildedRose.updateQuality();
      }

      assertEquals(gildedRose.toString(), newGildedRose.toString());
    }

}
