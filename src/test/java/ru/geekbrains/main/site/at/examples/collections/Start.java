package ru.geekbrains.main.site.at.examples.collections;

public class Start {
    public static void main(String[] args) {

// Эквивалентные обЪекты
//        Object object1 = new Object();
//        Object object2 = object1;
//        Object object3 = object2;
//
//        System.out.println(object1.equals(object2)&&object1.equals(object3)); // Выдаст true, объекты эквивалентны
//        System.out.println(object1 == object2 && object1 == object3); // Выдаст true, объекты эквивалентны
//        ----------------------------------------------------------------
        CarModel carModel1 = new CarModel("vaz-2106");
        CarModel carModel2 = new CarModel("vaz-2106");
        CarEngineType carEngineType1 = new CarEngineType("V8");
        CarModel carModel3 = null;
        CarModel carModel4 = null;

        System.out.println(carModel1.equals(carModel2));// Выдаст false, объекты не эквивалентны
        System.out.println(carModel1.equals(carEngineType1));
        System.out.println(carModel1.equals(carModel3));
//        System.out.println(carModel4.equals(carModel3)); // недопустимо сравнивать null объекты

        System.out.println(carModel1.hashCode()); //Имеют разные значения, поскольку не эквивалентны
        System.out.println(carModel2.hashCode()); //при отсутствии приведения @Override hashCode
    }

}

class CarEngineType {
    private String type;
    public CarEngineType(String type) {
        this.type = type;
    }
}

class CarModel {
    private String model;
    private int year;

    public CarModel(String model) {
        this.model = model;
        year = 0;
    }
    public CarModel(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CarModel carModel = (CarModel) o;

        if (year != carModel.year) return false;

//        return model != null ? model.equals(carModel.model) : carModel.model == null; // Запись через элвис-оператор

        return carModel.model.equals(this.model);  //Запись в стандартном варианте

    }

    @Override
    public int hashCode() {
//        return model != null ? model.hashCode() : 0;
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + year;
        return result;
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (o instanceof CarModel) {
//            if (((CarModel) o).model.equals(this.model)) {
//                return true;
//            }
//         }
//        return false;
//    }

    @Override
    public String toString() {
        return "CarModel{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}