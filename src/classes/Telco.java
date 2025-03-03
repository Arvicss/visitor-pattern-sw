package classes;

import interfaces.TelcoSubscription;
import interfaces.UnliCallOffer;
import interfaces.UsagePromo;

public class Telco implements TelcoSubscription {
  private final String telcoName;
  private final Integer dataAllowance;
  private Double price;
  private final Boolean unlimitedCallAndText;

  public Telco(Integer dataAllowance, Double price, String telcoName, Boolean unlimitedCallAndText) {
    this.telcoName = telcoName;
    this.dataAllowance = dataAllowance;
    this.price = price;
    this.unlimitedCallAndText = unlimitedCallAndText;
  }

  @Override
  public String getTelcoName() {
    return telcoName;
  }

  @Override
  public Double getPromoPrice() {
    return price;
  }

  @Override
  public Boolean getUnliCallText() {
    return unlimitedCallAndText;
  }

  @Override
  public String accept(UsagePromo promo, Double price) {
    return promo.showAllowance(this.telcoName, price);
  }

  @Override
  public String accept(UnliCallOffer unliPackage, Boolean unliCallText) {
    return unliPackage.showUnliCallsTextOffer(this.telcoName, unliCallText);
  }
}
