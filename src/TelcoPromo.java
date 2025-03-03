import classes.Telco;
import classes.TelcoAllowance;
import classes.UnliCallTextPackage;
import interfaces.TelcoSubscription;
import interfaces.UnliCallOffer;
import interfaces.UsagePromo;

public class TelcoPromo {
  public static void main(String[] args) {
    TelcoSubscription smart = new Telco(15, 500.0, "SMART", false);
    TelcoSubscription globe = new Telco(10, 450.0, "GLOBE",true);
    TelcoSubscription dito = new Telco(8, 400.0, "DITO", true);

    UsagePromo promo = new TelcoAllowance();
    UnliCallOffer unli = new UnliCallTextPackage();

    System.out.println("Smart Data Usage Offer and Price: " + smart.accept(promo, smart.getPromoPrice()));
    System.out.println("\nGlobe Data Usage Offer and Price: " + globe.accept(promo, smart.getPromoPrice()));
    System.out.println("\nDito Data Usage Offer and Price: " + dito.accept(promo, smart.getPromoPrice()));

    System.out.println("\nSmart unlimited calls and text package: " + smart.accept(unli, smart.getUnliCallText()));
    System.out.println("\nGlobe unlimited calls and text package: " + globe.accept(unli, globe.getUnliCallText()));
    System.out.println("\nDito unlimited calls and text package: " + dito.accept(unli, dito.getUnliCallText()));
  }
}
