package com.gildedrose;


public class ItemFactory {

    public ItemContract getItem(Item item){
        switch (ItemEnum.valueOfName(item.name())) {
            case BRIE:
                return new BrieItem(item);
            case CONCERT:
                return new ConcertItem(item);
            case ELIXIR:
            case VEST:
                return new RegularItem(item);
            case SULFURAS:
                return new SulfurasItem(item);
            case CONJURED:
                return new ConjuredItem(item);
            default:
                throw new IllegalArgumentException("Item has no known name!!!");
        }
    }
}
