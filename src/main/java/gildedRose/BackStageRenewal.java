package gildedRose;

public class BackStageRenewal implements ItemQualityRenewal{
    @Override
    public void updateQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
            if (item.getSellIn() < 11) {
                if (item.getQuality() < 50) {
                    item.setQuality(item.getQuality() + 1);
                }
            }
            if (item.getSellIn() < 6) {
                if (item.getQuality() < 50) {
                    item.setQuality(item.getQuality() + 1);
                }
            }
        }
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0){
            item.setQuality(0);
        }
    }
}
