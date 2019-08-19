package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name){
                case "Aged Brie":
                    updateAgedBrieQuality(items[i]);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    updateBackStageQuality(items[i]);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    updateNormalItemQuality(items[i]);
                    break;
            }
        }
    }

    private void updateAgedBrieQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
        reduceSellInIfNotSulfuras(item);
        if(item.sellIn < 0){
            if (item.quality < 50) {
                item.quality = item.quality + 1;
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
        if (item.quality < 50) {
            item.quality = item.quality + 1;
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