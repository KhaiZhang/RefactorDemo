package gildedRose;

public class AgedBrieRenewal implements ItemQualityRenewal{
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() < 50) {
            item.improveQuality(1);
        }
        item.reduceSellIn(1);
        if(item.getSellIn() < 0){
            if (item.getQuality() < 50) {
                item.improveQuality(1);
            }
        }
    }
}
