package gildedRose;
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].getName()){
                case "Aged Brie":
                    items[i].updateAgedBrieQuality();
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    items[i].updateBackStageQuality();
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    items[i].updateNormalItemQuality();
                    break;
            }
        }
    }

}