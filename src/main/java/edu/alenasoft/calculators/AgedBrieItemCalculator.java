package edu.alenasoft.calculators;

import edu.alenasoft.Item;

public class AgedBrieItemCalculator implements ItemCalculator {
  @Override
  public int getNextQuality(Item item) {
    int quality = item.getQuality();
    if (item.getSellIn() > 0) {
      return Math.min(quality + 1, 50);
    }
    return Math.min(quality + 2, 50);
  }
}
