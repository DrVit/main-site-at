package ru.geekbrains.main.site.at.examples.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetStart {
    public static void main(String[] args) {
        Set<CarModel> carModelSet = new HashSet<>();
        Set<CarModel> carModelSet1 = new HashSet<>();

        carModelSet1.add(new CarModel("vaz"));
        carModelSet1.add(new CarModel("bmw"));
        carModelSet1.add(new CarModel("zaporozhec"));

        CarModel[] carModels = { new CarModel("mercedes"), new CarModel("audi"), new CarModel("porch")}; //массив моделей

        carModelSet.addAll(Arrays.asList(carModels)); // добавление массива в List


        carModelSet.add(new CarModel("vaz"));
        carModelSet.add(new CarModel("volga"));
        carModelSet.add(new CarModel("vaz"));
        carModelSet.add(new CarModel("kia"));
        carModelSet.add(new CarModel("vaz"));
        carModelSet.add(new CarModel("bmw"));
        carModelSet.add(new CarModel("vaz"));
        carModelSet.add(new CarModel("vaz"));
        carModelSet.add(new CarModel("vaz"));
        carModelSet.add(new CarModel("vaz"));
        carModelSet.add(new CarModel("vaz"));
        carModelSet.add(new CarModel("vaz"));
        carModelSet.add(new CarModel("vaz"));

//       carModelSet.retainAll(carModelSet1); // находим пересечение между двумя set-ами


        for (CarModel carModel: carModelSet) {
            System.out.println(carModel);
        }

    }
}
