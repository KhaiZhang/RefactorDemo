package gildedRose;

public class NormalItemRenewal implements ItemQualityRenewal{
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() > 0) {
            item.reduceQuality(1);
        }
        item.reduceSellIn(1);
        if (item.getSellIn() < 0){
            if (item.getQuality() > 0) {
                item.reduceQuality(1);
            }
        }
    }
}
