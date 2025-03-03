import java.util.*;

public class UnliCallTextPackage implements UnliCallsTextOffer {

    private static Map<String, String> offerMap = new HashMap<>();

    static {
        offerMap.put("Smart", "Do not offer any free calls or texts, and you will be charged per use.");
        offerMap.put("Globe", "Comes with unlimited calls and texts to subscribers within their network. Calls and texts to other networks are charged extra.");
        offerMap.put("Ditto", "Includes unlimited calls and texts to all networks within the country.");
    }

    @Override
    public String showUnliCallText(String telcoName, boolean unliCallText) {
        if (!unliCallText) {
            return "Do not offer any free calls or texts, and you will be charged per use.";
        } else {
            return offerMap.getOrDefault(telcoName, "package");
        }
    }
}