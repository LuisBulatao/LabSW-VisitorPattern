public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubcription smart = new Telco("Smart", 15, 500, false);
        TelcoSubcription globe = new Telco("Globe", 10, 450, true);
        TelcoSubcription ditto = new Telco("Ditto", 8, 400, true);

        UsagePromo promo = new TelcoAllowance();
        UnliCallsTextOffer unli = new UnliCallTextPackage();

        System.out.println("Smart Data Usage Offer and price: " + promo.showAllowance(smart.getTelcoName(), smart.getPromoPrice()));
        System.out.println("Globe Data Usage Offer and price: " + promo.showAllowance(globe.getTelcoName(), globe.getPromoPrice()));
        System.out.println("Ditto Data Usage Offer and price: " + promo.showAllowance(ditto.getTelcoName(), ditto.getPromoPrice()));

        System.out.println("\nSmart unlimited calls and text package: " + unli.showUnliCallText(smart.getTelcoName(), smart.isUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " + unli.showUnliCallText(globe.getTelcoName(), globe.isUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " + unli.showUnliCallText(ditto.getTelcoName(), ditto.isUnliCallText()));
    }
}
