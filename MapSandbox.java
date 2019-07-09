import java.util.Map;
import java.util.HashMap;

class MapSandbox {

    public Map createMapAndPrintToConsole() {
        Map<String, String> meals = new HashMap<>();
        meals.put("breakfast", "pancakes");
        meals.put("lunch", "enchiladas");
        meals.put("supper", "beans & rice");
        return meals;
    }
}
