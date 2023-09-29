package org.example.creational.abstractfactory.banking;

import org.example.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java write code");
    }
}
