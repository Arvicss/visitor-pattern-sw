package classes;

import interfaces.UnliCallOffer;

import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallOffer {
  private static final Map<String, Boolean> dataAllowance = new HashMap<>();

  static {
    dataAllowance.put("SMART", false);
    dataAllowance.put("GLOBE", true);
    dataAllowance.put("DITO", true);
  }

  @Override
  public String showUnliCallsTextOffer(String telcoName, Boolean unlimitedCallAndText) {
    String callAndText = dataAllowance.get(telcoName) ? "Unlimited Call and Text" : "N/A";

    return "\nCall & Text Package:\n\t\t" + callAndText;
  }
}
