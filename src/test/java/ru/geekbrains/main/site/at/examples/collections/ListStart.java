package ru.geekbrains.main.site.at.examples.collections;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListStart {
    public static void main(String[] args) {
        List<CarModel> carModelList = new ArrayList<>();

        CarModel m1 = new CarModel("4321");

        carModelList.add(new CarModel("123"));
        carModelList.add(new CarModel("1234"));
        carModelList.add(m1);
        carModelList.add(new CarModel("1231"));
        carModelList.add(new CarModel("1233"));
        carModelList.add(new CarModel("1268"));

        System.out.println(carModelList.indexOf(m1)); //получение индекса элемента по объекту
        System.out.println(carModelList.contains(m1)); // проверка на вхождение элемента в коллекцию
        System.out.println(carModelList.remove(m1)); // удаление элемента из коллекции
        System.out.println(carModelList.contains(m1)); // удаление элемента из коллекции


//        for (CarModel model: carModelList) {
//            System.out.println(model);
//        }
//  -----------------------------------------------------------------------------
//        Array
//        CarModel[] carModelsArray = { new CarModel("132"), new CarModel("1234",1995), new CarModel("bmw x5")};
//
//        System.out.println(carModelsArray[0]);
//        System.out.println(carModelsArray[1]);
//        System.out.println(carModelsArray[2]);
//  -------------------------------------------------------------------------------
//        Iterator<CarModel> iterator = carModelList.iterator(); // Итератор
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//            iterator.remove(); //работает после вызова next()
//        }

//        carModelList.forEach(System.out::println);




//        System.out.println(carModelList.size());
    }
}
