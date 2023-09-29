package org.example.creational.abstractfactory.website;

import org.example.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("write php code");
    }
}
