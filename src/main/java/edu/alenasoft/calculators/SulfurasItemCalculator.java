package edu.alenasoft.calculators;

import edu.alenasoft.Item;

public class SulfurasItemCalculator implements ItemCalculator {
  @Override
  public int getNextQuality(Item item) {
    return item.getQuality();
  }
}
