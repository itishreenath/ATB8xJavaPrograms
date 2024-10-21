package oct.ex041024_Constructor;
//import sept.Person;

public class Lab094 {
    public static void main(String[] args) {
        Person person = new Person();
        // Real thing class -> Object
        person.name = "Amit"; // this from the Person class in both same and sept package
        person.talk(); // this from the Person class in both same and sept same package
        person.walk();// this from the Person class in the same package
        System.out.println();
        Person person2 = new Person();
        // Real thing class -> Object
        person2.name = "Pramod";
        person2.talk(); // this from the Person class in both same and sept same package
        person2.read();// this from the Person class in the same package
        person2.sleep();// this from the Person class in the same package
        ATBStudent atbStudent;
        atbStudent = new ATBStudent();
    }
}
