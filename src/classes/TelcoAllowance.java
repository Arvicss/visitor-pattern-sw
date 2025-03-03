package classes;

import interfaces.UsagePromo;

import java.util.HashMap;
import java.util.Map;

public class TelcoAllowance implements UsagePromo {
  private static final Map<String, Integer> dataAllowance = new HashMap<>();

  static {
    dataAllowance.put("SMART", 15);
    dataAllowance.put("GLOBE", 10);
    dataAllowance.put("DITO", 8);
  }

  @Override
  public String showAllowance(String telcoName, Double promoPrice) {
    return "\nData Allowance: " + dataAllowance.get(telcoName) + "gb\nPrice: " + promoPrice;
  }
}
