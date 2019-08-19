package gildedRose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    protected void reduceSellInIfNotSulfuras() {
        if (!name.equals("Sulfuras, Hand of Ragnaros")) {
            sellIn = sellIn - 1;
        }
    }

    void updateAgedBrieQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
        reduceSellInIfNotSulfuras();
        if(sellIn < 0){
            if (quality < 50) {
                quality = quality + 1;
            }
        }
    }

    void updateNormalItemQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
        reduceSellInIfNotSulfuras();
        if (sellIn < 0){
            if (quality > 0) {
                quality = quality - 1;
            }
        }
    }

    void updateBackStageQuality() {
        if (quality < 50) {
            quality = quality + 1;
            if (sellIn < 11) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
            if (sellIn < 6) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
        reduceSellInIfNotSulfuras();
        if (sellIn < 0){
            quality  = 0;
        }
    }
}
