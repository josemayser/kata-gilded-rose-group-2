package edu.alenasoft.calculators;

import edu.alenasoft.Item;

public class NormalItemCalculator implements ItemCalculator {
  @Override
  public int getNextQuality(Item item) {
    int quality = item.getQuality();
    if (item.getSellIn() > 0) {
      return Math.max(quality - 1, 0);
    }
    return Math.max(quality - 2, 0);
  }
}
