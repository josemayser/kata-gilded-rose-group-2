package edu.alenasoft.factories;

import edu.alenasoft.calculators.*;

public class ItemCalculatorFactory {
  public ItemCalculator createItemCalculator(String itemName) {
    switch (itemName) {
      case "Aged Brie":
        return new AgedBrieItemCalculator();
      case "Backstage passes to a TAFKAL80ETC concert":
        return new BackstageItemCalculator();
      case "Sulfuras, Hand of Ragnaros":
        return new SulfurasItemCalculator();
      case "Conjured Mana Cake":
        return new ConjuredItemCalculator();
      default:
        return new NormalItemCalculator();
    }
  }
}
