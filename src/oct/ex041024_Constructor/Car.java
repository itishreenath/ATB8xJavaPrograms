package oct.ex041024_Constructor;

public class Car {
    // Engine and Tyre
    Engine engine;
    Tyre tyre;

    Car(){
        System.out.println("I am from car class");
    }
}

class Engine {
    // attribute, data member, instance variable, properties
    public static void main(String[] args) {
        Car obj = new Car();
    }

    // behave / methods/  functionalities
}

class Tyre {
    // attribute, data member, instance variable, properties
    // behave / methods/  functionalities
}
