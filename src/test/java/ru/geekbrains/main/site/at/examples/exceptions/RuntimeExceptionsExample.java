package ru.geekbrains.main.site.at.examples.exceptions;

import com.sun.org.apache.xpath.internal.objects.XStringForChars;
import org.openqa.selenium.ElementNotVisibleException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class RuntimeExceptionsExample {
    public static void main(String[] args) {

//       try {
//           System.out.println(arithmeticExceptionExample(5,0));
//       }
//       catch (ArithmeticException exception){
//           exception.printStackTrace();
//           System.out.println("I'm fine");
//       }

//  Ошибка вывода несуществующего элемента массива
//       int [] a = {1, 2, 3, 4, 5};
//        System.out.println(getElementByIndex(a,10));


//  Объект int не может быть приведен к виду String (ошибка приведения типов)
//        Object object = 1;
//        System.out.println((String) object);
//        System.out.println(object.toString());

//  Null pointer exception
//        Object o = null;
//        System.out.println(o.hashCode());
//

// string index out of bounds
//        try {
//            char a = getByIndex(10);
//        } catch (StringIndexOutOfBoundsException exception) {
//            exception.printStackTrace();
//        }

// обработка проброса из FileReaderExample
//        try {
//            FileReader r = new FileReaderExample().readFile("123");
//        } catch (FileNotFoundException exception) {
//            exception.printStackTrace();
//        }

        throw new ElementNotVisibleException("123");

    }


//    public static double arithmeticExceptionExample() {
//        return 5/0;
//    }

//  Деление на ноль:
//    public static double arithmeticExceptionExample(int a, int b) {
//        return a/b;
//    }
//    Деление на ноль double - выдает infinity
//    public static double arithmeticExceptionExample(double a, double b) {
//            return a/b;
//}


//  Ошибка вывода несуществующего элемента массива
//    public static int getElementByIndex(int[] a, int i) {
//        return a[i];
//    }

    public static char getByIndex(int index) {
        return "Бармаглот".charAt(index);
    }
}
