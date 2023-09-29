package org.example.creational.factory;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("ddd");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality) {
        switch (speciality) {
            case ("java"):
                return new JavaDevFactory();
            case ("c++"):
                return new CppDevFactory();
            default:
                throw  new RuntimeException(speciality + "not such speciality");
        }

    }
}
