public class Dog extends Animal {
    // child class that inherits from the abstract class Animal
    public int bark() {
        System.out.println("This dog barks. It is " + age + " years old.");
        return age;
    }

    public void move() {
        System.out.println("This dog runs forward.");
    }

    public void sleep(){

    }
}
