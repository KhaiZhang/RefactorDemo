package gildedRose;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void should_return_quality_29_and_sellIn_14_given_a_normal_item_its_sellIn_is_15_quality_is_30() {
        Item normal_rose = new Item("normal rose", 15, 30);
        Item[] items = new Item[]{normal_rose};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("normal rose, 14, 29", normal_rose.toString());
    }

    @Test
    public void should_return_quality_0_and_sellIn_14_given_a_normal_item_its_sellIn_is_15_quality_is_0() {
        Item normal_rose = new Item("normal rose", 15, 0);
        Item[] items = new Item[]{normal_rose};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("normal rose, 14, 0", normal_rose.toString());
    }

    @Test
    public void should_return_quality_28_and_sellIn_negatice_1_given_a_normal_item_its_sellIn_is_0_quality_is_30() {
        Item normal_rose = new Item("normal rose", 0, 30);
        Item[] items = new Item[]{normal_rose};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("normal rose, -1, 28", normal_rose.toString());
    }

    @Test
    public void should_return_quality_31_and_sellIn_14_given_a_Aged_Brie_its_sellIn_is_15_quality_is_30() {
        Item Aged_Brie = new Item("Aged Brie", 15, 30);
        Item[] items = new Item[]{Aged_Brie};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("Aged Brie, 14, 31", Aged_Brie.toString());
    }

    @Test
    public void should_return_quality_50_and_sellIn_14_given_a_Aged_Brie_its_sellIn_is_15_quality_is_50() {
        Item Aged_Brie = new Item("Aged Brie", 15, 50);
        Item[] items = new Item[]{Aged_Brie};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("Aged Brie, 14, 50", Aged_Brie.toString());
    }

    @Test
    public void should_return_quality_50_and_sellIn_nagetive_1_given_a_Aged_Brie_its_sellIn_is_0_quality_is_50() {
        Item Aged_Brie = new Item("Aged Brie", 0, 50);
        Item[] items = new Item[]{Aged_Brie};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("Aged Brie, -1, 50", Aged_Brie.toString());
    }

    @Test
    public void should_return_quality_32_and_sellIn_nagetive_1_given_a_Aged_Brie_its_sellIn_is_0_quality_is_30() {
        Item Aged_Brie = new Item("Aged Brie", 0, 30);
        Item[] items = new Item[]{Aged_Brie};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("Aged Brie, -1, 32", Aged_Brie.toString());
    }

    @Test
    public void should_return_quality_32_and_sellIn_14_given_a_Backstage_its_sellIn_is_15_quality_is_30() {
        Item backstage = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 30);
        Item[] items = new Item[]{backstage};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 14, 31", backstage.toString());
    }

    @Test
    public void should_return_quality_50_and_sellIn_14_given_a_Backstage_its_sellIn_is_15_quality_is_50() {
        Item backstage = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 50);
        Item[] items = new Item[]{backstage};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 14, 50", backstage.toString());
    }

    @Test
    public void should_return_quality_32_and_sellIn_10_given_a_Backstage_its_sellIn_is_11_quality_is_30() {
        Item backstage = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 30);
        Item[] items = new Item[]{backstage};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 10, 31", backstage.toString());
    }

    @Test
    public void should_return_quality_32_and_sellIn_5_given_a_Backstage_its_sellIn_is_6_quality_is_30() {
        Item backstage = new Item("Backstage passes to a TAFKAL80ETC concert", 6, 30);
        Item[] items = new Item[]{backstage};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 5, 32", backstage.toString());
    }

    @Test
    public void should_return_quality_33_and_sellIn_2_given_a_Backstage_its_sellIn_is_3_quality_is_30() {
        Item backstage = new Item("Backstage passes to a TAFKAL80ETC concert", 3, 30);
        Item[] items = new Item[]{backstage};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 2, 33", backstage.toString());
    }

    @Test
    public void should_return_quality_50_and_sellIn_2_given_a_Backstage_its_sellIn_is_3_quality_is_49() {
        Item backstage = new Item("Backstage passes to a TAFKAL80ETC concert", 3, 49);
        Item[] items = new Item[]{backstage};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 2, 50", backstage.toString());
    }

    @Test
    public void should_return_quality_50_and_sellIn_2_given_a_Backstage_its_sellIn_is_3_quality_is_48() {
        Item backstage = new Item("Backstage passes to a TAFKAL80ETC concert", 3, 48);
        Item[] items = new Item[]{backstage};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, 2, 50", backstage.toString());
    }

    @Test
    public void should_return_quality_0_and_sellIn_nagetive_1_given_a_Backstage_its_sellIn_is_0_quality_is_30() {
        Item backstage = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 30);
        Item[] items = new Item[]{backstage};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", backstage.toString());
    }

    @Test
    public void should_return_quality_30_and_sellIn_0_given_a_Sulfuras_its_sellIn_is_0_quality_is_30() {
        Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 0, 30);
        Item[] items = new Item[]{sulfuras};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros, 0, 30", sulfuras.toString());
    }

    @Test
    public void should_return_quality_0_and_sellIn_0_given_a_Sulfuras_its_sellIn_is_0_quality_is_0() {
        Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 0, 0);
        Item[] items = new Item[]{sulfuras};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals("Sulfuras, Hand of Ragnaros, 0, 0", sulfuras.toString());
    }

    @Test
    public void should_return_three_items_given_Sulfuras_Backstage_normal() {
        Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 10, 10);
        Item backstage = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 30);
        Item normal_rose = new Item("normal rose", 15, 30);
        Item[] items = new Item[]{sulfuras,backstage,normal_rose};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.updateQuality();

        assertEquals(3,gildedRose.items.length);
        assertEquals("Sulfuras, Hand of Ragnaros, 10, 10", sulfuras.toString());
        assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", backstage.toString());
        assertEquals("normal rose, 14, 29", normal_rose.toString());
    }

    @Test
    public void should_reduce_SellIn_given_not_Sulfuras_item_its_sellIn_is_10() {
        Item normal_rose = new Item("normal rose", 10, 30);
        Item[] items = new Item[]{normal_rose};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.reduceSellInIfNotSulfuras(normal_rose);

        assertEquals(9,normal_rose.sellIn);
    }

    @Test
    public void should_keep_SellIn_given__Sulfuras_item_its_sellIn_is_10() {
        Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 10, 30);
        Item[] items = new Item[]{sulfuras};
        GildedRose gildedRose = new GildedRose(items);

        gildedRose.reduceSellInIfNotSulfuras(sulfuras);

        assertEquals(10,sulfuras.sellIn);
    }

}