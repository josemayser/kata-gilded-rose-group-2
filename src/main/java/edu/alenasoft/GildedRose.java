package edu.alenasoft;

import edu.alenasoft.calculators.ItemCalculator;
import edu.alenasoft.factories.ItemCalculatorFactory;

import java.util.List;

public class GildedRose {
  public static List<Item> items = null;

  public static void main(String[] args) {

    System.out.println("OMGHAI!");

    items.add(new Item("+5 Dexterity Vest", 10, 20));
    items.add(new Item("Aged Brie", 2, 0));
    items.add(new Item("Elixir of the Mongoose", 5, 7));
    items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
    items.add(new Item("Conjured Mana Cake", 3, 6));

    updateQuality();

    System.out.println(items);
  }

  public static void updateQuality() {
    for (Item item : items) {
      if (!item.getName().equals("Sulfuras, Hand of Ragnaros")) {
        item.setSellIn(item.getSellIn() - 1);
      }
      ItemCalculatorFactory itemCalculatorFactory = new ItemCalculatorFactory();
      ItemCalculator itemCalculator = itemCalculatorFactory.createItemCalculator(item.getName());
      item.setQuality(itemCalculator.getNextQuality(item));
    }
  }
}
