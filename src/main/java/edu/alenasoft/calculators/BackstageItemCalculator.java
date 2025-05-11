package edu.alenasoft.calculators;

import edu.alenasoft.Item;

public class BackstageItemCalculator implements ItemCalculator {
  @Override
  public int getNextQuality(Item item) {
    int sellIn = item.getSellIn();
    int quality = item.getQuality();
    if (sellIn <= 0) {
      return 0;
    }
    if (sellIn <= 5) {
      return Math.min(quality + 3, 50);
    }
    if (sellIn <= 10) {
      return Math.min(quality + 2, 50);
    }
    return Math.min(quality + 1, 50);
  }
}
