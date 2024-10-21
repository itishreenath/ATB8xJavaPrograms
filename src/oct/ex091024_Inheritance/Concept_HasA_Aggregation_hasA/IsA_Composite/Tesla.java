package oct.ex091024_Inheritance.Concept_HasA_Aggregation_hasA.IsA_Composite;

import oct.ex091024_Inheritance.Concept_HasA_Aggregation_hasA.Car;

public class Tesla extends Car {
    // IS - A Inheritance
    void test() {
        startCar();
    }

    public static void main(String[] args) {
        Tesla carobj = new Tesla();
        carobj.test();
    }

}
