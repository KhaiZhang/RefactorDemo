package gildedRose;

public class Item {

    private String name;

    private int sellIn;

    private int quality;

    private ItemQualityRenewal itemQualityRenewal;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public ItemQualityRenewal getItemQualityRenewal() {
        switch (this.getName()){
            case "Aged Brie":
                return new AgedBrieRenewal();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackStageRenewal();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasRenewal();
            default:
                return new NormalItemRenewal();
        }
    }

    public void setItemQualityRenewal(ItemQualityRenewal itemQualityRenewal) {
        this.itemQualityRenewal = itemQualityRenewal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void reduceQuality(int number){
        setQuality(getQuality() - number);
    }

    public void improveQuality(int number){
        setQuality(getQuality() + number);
    }

    public void reduceSellIn(int number){
        setSellIn(getSellIn() - number);
    }
    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void update(){
        getItemQualityRenewal().updateQuality(this);
    }
}
