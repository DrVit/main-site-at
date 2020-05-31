package ru.geekbrains.main.site.at.examples.junit;

import org.junit.jupiter.api.Disabled;

@Disabled
public class ChildStaticExampleClass extends BaseStaticExampleClass {

    public static void sayHello() {
        System.out.println("Hello, Im Child!");
    }
}
