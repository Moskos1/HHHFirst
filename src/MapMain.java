import java.util.*;

public class MapMain {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("T-Shirt", 5);
        map.put("Jeans", 5);
        map.put("Gloves", 5);
        System.out.println(map);
//         int value = map.put("Jeans", 4);
//        System.out.println(map);
//        System.out.println(value);

        Set<String> set = map.keySet();
        System.out.println(set);
        Collection<Integer> collection = map.values();
        System.out.println(collection);
        Set<Map.Entry<String, Integer>> values =  map.entrySet();
        Set <Integer> sets = new HashSet<>(collection);
        System.out.println(sets);

        EnumMap<Country, Integer> worldCup = new EnumMap<Country, Integer>(Country.class);
        worldCup.put(Country.POLAND, 8);
        worldCup.put(Country.UKRAINE, 1);
        worldCup.put(Country.BELARUS, 0);

        System.out.println(worldCup);
    }
}
