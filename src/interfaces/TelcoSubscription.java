package interfaces;

public interface TelcoSubscription {
  String getTelcoName();
  Double getPromoPrice();
  Boolean getUnliCallText();

  public String accept(UsagePromo promo, Double price);
  public String accept(UnliCallOffer unliPackage, Boolean unliCallText);
}
