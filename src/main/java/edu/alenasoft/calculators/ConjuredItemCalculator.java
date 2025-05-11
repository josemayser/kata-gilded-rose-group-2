package edu.alenasoft.calculators;

import edu.alenasoft.Item;

public class ConjuredItemCalculator implements ItemCalculator {
  @Override
  public int getNextQuality(Item item) {
    int quality = item.getQuality();
    if (item.getSellIn() > 0) {
      return Math.max(quality - 2, 0);
    }
    return Math.max(quality - 4, 0);
  }
}
