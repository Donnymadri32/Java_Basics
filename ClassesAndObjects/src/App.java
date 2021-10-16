
class Person  {

    // Instance variables (data or "state")
    String name;
    int age;


    // Classes can contain

    // 1. Data
    // 2. Sub-routines (Methods)
    void speak(){
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    void sayHello(){
        System.out.println("Hello, there!");
    }
}

public class App {
    // Sub-routine
    public static void main(String[] args){

        Person person1 = new Person();
        person1.name = "Joe Blocks";
        person1.age = 37;
        person1.speak();

        Person person2 = new Person();
        person2.name = "Sarah Smith";
        person2.age = 20;
        person2.speak();

        System.out.println(person1.name);
        person1.sayHello();
    }
}
