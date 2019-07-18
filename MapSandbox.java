import java.util.Map;
import java.util.HashMap;

class MapSandbox {
    public static final String BREAKFAST = "breakfast";
    public static final String LUNCH = "lunch";
    public static final String SUPPER = "supper";

    public Map createMapAndPrintToConsole() {
        Map<String, String> meals = new HashMap<>();
        meals.put(BREAKFAST, "pancakes");
        meals.put(LUNCH, "enchiladas");
        meals.put(SUPPER, "beans & rice");
        return meals;
    }

    /**
     * Important methods to remember:
     * get
     * remove
     * containsKey
     * containsValue
     * size
     *
     * Gotchas:
     * 1.) Can't have duplicate keys. Entries will get over-written
     * 2.) Use constants for keys (best practice)
     */
}
