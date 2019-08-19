package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")){
                    updateNormalItemQuality(items[i]);
                    continue;
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        updateBackStageQuality(items[i]);
                        continue;
                    }
                }
            }

            reduceSellInIfNotSulfuras(items[i]);

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")){
                            continue;
                        }
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }

    private void updateNormalItemQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
        reduceSellInIfNotSulfuras(item);
        if (item.sellIn < 0){
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }

    private void updateBackStageQuality(Item item) {
        if (item.sellIn < 11) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }

        if (item.sellIn < 6) {
            if (item.quality < 50) {
                item.quality = item.quality + 1;
            }
        }
        reduceSellInIfNotSulfuras(item);
        if (item.sellIn < 0){
            item.quality  = 0;
        }
    }

    protected void reduceSellInIfNotSulfuras(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn = item.sellIn - 1;
        }
    }
}