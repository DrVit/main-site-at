package ru.geekbrains.main.site.at.examples.junit;

import org.junit.jupiter.api.Disabled;

@Disabled
public class Start {

    public static void main(String[] args) {
        BaseStaticExampleClass child = new ChildStaticExampleClass();
        child.sayHello();       // <- вызвали статический метод у экземпляра дочернего класса
    }
}
