package ru.geekbrains.main.site.at.examples.collections;

import java.util.HashMap;
import java.util.Map;

public class MapStart {
    public static void main(String[] args) {
        Map<CarModel, String> carMap = new HashMap<>();

        carMap.put(new CarModel("vaz"), "very bad!");
        CarModel vaz = new CarModel("vaz");
        carMap.put(vaz, "very bad!");

        carMap.put(new CarModel("bmw"), "nice car!");
        carMap.put(new CarModel("zaporozhec"), "amazing driving experience! Wow!");

//        System.out.println(carMap.values());
//        System.out.println(carMap.get(vaz));
//        System.out.println(carMap.containsKey(vaz));
//        System.out.println(carMap.containsValue("nice car!"));

        System.out.println(carMap);

        Map<String, String> coutryCity = new HashMap<>();
        coutryCity.put("Russia", "Moscow");
        coutryCity.put("Belarus", "Minsk");
        coutryCity.put("Ukraine", "Kiev");
        System.out.println(coutryCity);


    }
}
