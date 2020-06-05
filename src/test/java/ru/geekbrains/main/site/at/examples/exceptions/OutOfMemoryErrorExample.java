package ru.geekbrains.main.site.at.examples.exceptions;

import java.util.ArrayList;
import java.util.List;

    public class OutOfMemoryErrorExample {
             public static List<Object[]> objectList;

    public static void main(String[] args) {
//1   (1 и 2 пример необрабавыемых искчений)         test();
        objectList = new ArrayList<>();
        while (true){
           objectList.add(new Object[1000000000]);
        }


    }
//1    public static void test() {
//1/*       Recursive call (без четко прописанных условий выхода приводит к переполнению стека)*/
//1        test();
//1    }

}