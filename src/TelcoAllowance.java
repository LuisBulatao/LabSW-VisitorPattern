import java.util.*;

public class TelcoAllowance implements UsagePromo {


    private static Map<String, Integer> telcoMap = new HashMap<>();

    static {
        telcoMap.put("Smart", 15);
        telcoMap.put("Globe", 10);
        telcoMap.put("Ditto", 8);
    }

    public String showAllowance(String telcoName, double money) {
        int dataAllowance = telcoMap.get(telcoName);

        return "Offers a data allowance of " + dataAllowance + "GB for ₱" + money + " per month";
    }

}