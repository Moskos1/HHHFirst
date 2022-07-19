import java.util.ArrayList;
import java.util.HashMap;

public class HHH {
    public static void main(String[] args) {

        HashMap<String,String> officeTool = new HashMap<>();
        officeTool.put("S234", "Большой степлер");
        officeTool.put("P326", "Принтер");
        officeTool.put("N808", "Ножницы");
        System.out.println(officeTool);
        officeTool.put("N808", "Блокнот");
        System.out.println(officeTool);

        HashMap<String, ArrayList<Double>> menu = new HashMap<>();
        ArrayList<Double> mohitoPrice = new ArrayList<>(); // создаем список с ценами на мохито
        mohitoPrice.add(350.0);
        mohitoPrice.add(15.50);
        mohitoPrice.add(13.20);
        menu.put("Mohito",mohitoPrice);

        ArrayList<Double> tiramisuPrice = new ArrayList<>();
        tiramisuPrice.add(120.0);
        tiramisuPrice.add(4.0);
        tiramisuPrice.add(3.2);
        menu.put("Tiramisy",tiramisuPrice);

        ArrayList<Double> ramenPrice = new ArrayList<>();
         ramenPrice.add(230.0);
        ramenPrice.add(8.5);
        ramenPrice.add(7.0);
        menu.put("Ramen", ramenPrice);
        System.out.println(menu);

        for (String inventory: officeTool.keySet()) {
            System.out.println(inventory);
        }
        officeTool.remove("N808");
        System.out.println(officeTool.get("N808"));

        System.out.println(officeTool.containsValue("Ничего"));
        System.out.println("Pappka dobavlena 1 raz");
        System.out.println("19-07 proba dobavleniya na git");
}}
