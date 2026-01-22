public class Main {
    public static void main(String[] args) {
        // creating new objects
        Dog dg = new Dog();
        Cheetah ch = new Cheetah();
        // using setAge() method declared in Dog Class to add value for dg object instance
        dg.setAge(14);

        // object method executions
        dg.move();
        ch.move();
        ch.sleep();
        dg.bark();

        // creating object from Bee class, which inherits from the Insect interface

        Bee b = new Bee();
        // executing methods from Bee class (note that the "legs" variable already has a value in Insect interface)
        b.fly();
        b.bite();
        // executing methods that come from the Animal class
        b.move();
        b.sleep();
    }
}

